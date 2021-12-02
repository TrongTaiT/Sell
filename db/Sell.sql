USE MASTER
GO
DECLARE @dbname nvarchar(128)
SET @dbname = N'SELL'
IF (EXISTS (SELECT * from sysdatabases
	WHERE ('[' + name + ']' = @dbname 
	OR name = @dbname)))
		DROP DATABASE SELL
GO
CREATE DATABASE SELL
GO
USE SELL
GO

-- CREATE TABLE
CREATE TABLE KhachHang (
    MaKhachHang CHAR(7) PRIMARY KEY,
    HoTen NVARCHAR(50) NOT NULL,
    GioiTinh bit, -- 0: nam, 1: nữ
    NgaySinh DATE NOT NULL,
    DienThoai char(15) NOT NULL UNIQUE,
    Email VARCHAR(320) NOT NULL UNIQUE,
    DiaChi NVARCHAR(255) NOT NULL,
    NgayDK DATE NOT NULL
)

CREATE TABLE PhieuGiamGia ( -- không phải thành viên 0 giảm, thành viên 5%, mã giảm giá 10%
    MaGiamGia int identity(1,1) PRIMARY KEY,
    NgayHetHan date NOT NULL,
    MaKhachHang CHAR(7) NOT NULL,
    TrangThai bit, -- 0 hết hạn (nếu đã sử dụng tự động đưa trạng thái về hết hạn), 1 còn hạn
    FOREIGN KEY (MaKhachHang) REFERENCES KHACHHANG (MaKhachHang)
)

CREATE TABLE NhanVien (
    MaNhanVien CHAR(7) PRIMARY KEY,
    HoTen NVARCHAR(50) NOT NULL,
    GioiTinh bit NOT NULL, -- 0: nam, 1: nữ
    NgaySinh DATE NOT NULL,
    DienThoai char(15) NOT NULL UNIQUE,
    Luong float NOT NULL,
    Email VARCHAR(320) NOT NULL UNIQUE,
    VaiTro int NOT NULL, -- 0: Vai trò, 1: Nhân Viên, 2: Quản lý, 3: Giám đốc, 4: Đã nghỉ việc
    MatKhau VARCHAR(50),
    DiaChi NVARCHAR(255) NOT NULL,
    MaCuaHang char(7) NOT NULL
)

CREATE TABLE CuaHang (
    MaCuaHang char(7) PRIMARY KEY,
    DiaChi nvarchar(225) NOT NULL,
    MaQuanLy char(7) NOT NULL,
    TrangThai bit NOT NULL
    FOREIGN KEY (MaQuanLy) REFERENCES NHANVIEN (MaNhanVien)
)

CREATE TABLE LoaiHang(
	MaLoai char(7) PRIMARY KEY,
	TenLoai nvarchar(225) NOT NULL,
	GhiChu nvarchar(225)
)

CREATE TABLE SanPham (
    MaSanPham char(7) PRIMARY KEY ,
    TenSP   nvarchar(225) NOT NULL,
    NhaSX nvarchar(225) NOT NULL,
    GhiChu nvarchar(225),
	MaLoai char(7) NOT NULL,
    GiaTien float NOT NULL,
	FOREIGN KEY (MaLoai) REFERENCES LoaiHang(MaLoai)
)


CREATE TABLE ChiTietCuaHang (
    MaCuaHang char(7),
    MaSanPham char(7),
    SoLuong int NOT NULL,
    FOREIGN KEY (MaCuaHang) REFERENCES CuaHang(MaCuaHang),
    FOREIGN KEY (MaSanPham) REFERENCES SanPham(MaSanPham)
)

CREATE TABLE HinhAnh (
    MaSanPham char(7) ,
    TenHinhAnh nvarchar(255) NOT NULL,
    HinhAnh varBinary(max) null,
    foreign key (MaSanPham) REFERENCES SanPham(MaSanPham)
)

CREATE TABLE HoaDonNhap (
    MaNhapHang char(7) PRIMARY KEY,
    MaSanPham char(7) NOT NULL,
    SoLuong int NOT NULL,
    GiaTien float NOT NULL,
    MaQuanLy CHAR(7) NOT NULL,
    NgayNhap date NOT NULL,
    GhiChu nvarchar(225) null,
    MaCuaHang char(7) NOT NULL,

    foreign key (MaSanPham) REFERENCES SanPham(MaSanPham),
    foreign key (MaCuaHang) REFERENCES CuaHang(MaCuaHang),
    foreign key (MaQuanLy) REFERENCES NHANVIEN(MaNhanVien)
)

CREATE TABLE HoaDonBanHang (
    MaHDBan char(7) PRIMARY KEY,
    MaKhachHang char(7)  null,
    NgayBan date NOT NULL,
    NoiDung nvarchar(225) null,
    TrangThai bit,
    MaNhanVien char(7) NOT NULL,
    MaCuaHang char(7) NOT NULL,
    MaGiamGia int,

    foreign key (MaKhachHang) REFERENCES KhachHang(MaKhachHang),
    foreign key (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
    foreign key (MaCuaHang) REFERENCES CuaHang(MaCuaHang),
    foreign key (MaGiamGia) REFERENCES PHIEUGIAMGIA(MaGiamGia)
)

CREATE TABLE HoaDonChiTiet (
    MaHDBan char(7) NOT NULL,
    MaSanPham char(7) NOT NULL,
    SoLuong int NOT NULL,
    ThanhTien float NOT NULL,

    PRIMARY KEY(MaHDBan,MaSanPham),
    foreign key (MaHDBan) REFERENCES HoaDonBanHang(MaHDBan),
    foreign key (MaSanPham) REFERENCES SanPham(MaSanPham)
)
GO

-- INSERT VALUES
INSERT INTO [dbo].[KHACHHANG]
    VALUES  ('KH01',N'Nguyễn Trọng Tài',1,'1996-07-28', '0784224338','nguyentrongtai.ait@gmail.com',N'Gò Vấp, Thành phố Hồ Chí Minh','2021-11-18'),
            ('KH02',N'Nguyễn Trường Chinh',1,'2001-08-01', '0345148479','chinhnguyen010801@gmail.com',N'quận 12, Thành phố Hồ Chí Minh','2021-11-18'),
            ('KH03',N'Trần Lê Hồng Phúc',1,'2001-01-12','0928923678','phuctlhps15000@fpt.edu.vn',N'quận 12, Thành phố Hồ Chí Minh','2021-11-19'),
            ('KH04',N'Trần Hải Triều',1,'2000-02-08','0988528937','trieuth@gmail.com',N'Gò Vấp, Thành phố Hồ Chí Minh','2021-11-20'),
            ('KH05',N'Lê Hoàng Thiên Phúc',1,'2002-11-10','0861528238','phuclhtps15001@fpt.edu.vn',N'Gò Vấp, Thành phố Hồ Chí Minh','2021-11-20'),
            ('KH06',N'Trần Thị Ngọc Trinh',0,'1989-09-27','0902993991','trinhttnps15068@fpt.edu.vn',N'quận 9, Thành phố Hồ Chí Minh','2021-11-21')

GO
           
INSERT INTO [dbo].[PhieuGiamGia] (NgayHetHan, MaKhachHang, TrangThai)
    VALUES  ('2021-12-15','KH01',1),
            ('2021-12-16','KH01',1),
            ('2021-12-18','KH01',1),
            ('2021-12-18','KH03',1),
            ('2021-12-21','KH03',1)

GO

INSERT INTO [dbo].[NHANVIEN]
    VALUES  ('NV01',N'Lê Bảo Liên',0,'1996-08-10','0784336987',11000000,'lienlbnv01@sell.com',2,'songlong',N'Thành phố Hồ Chí Minh','CH001'),
            ('NV02',N'Nguyễn Trường Giang',1,'1999-12-31','0131283789',10000000,'giangntnv02@sell.com',2,'songlong',N'Thành phố Vinh','CH002'),
            ('NV03',N'Bùi Đình Bảo',1,'1996-03-03','0198392278',10000000,'baobdnv03@sell.com',2,'songlong',N'Thành phố Hà Tĩnh','CH003'),
            ('NV04',N'Lê Thị Mỹ Trâm',0,'1995-10-28','0123893923',10000000,'tramltmnv04@sell.com',2,'songlong',N'Thành phố Đà Nẵng','CH004'),
            ('NV05',N'Trương Thị Mỹ Hoa',0,'1990-11-23','0128392412',10000000,'hoattmnv05@sell.com',2,'songlong',N'Thành phố Hà Nội','CH005'),
            ('NV06',N'Nguyễn Giám Đốc',0,'1980-11-12','0989898989',50000000,'docngnv06@sell.com',3,'songlong',N'Thành phố Hồ Chí Minh','CH001')
GO

-- ADD PRIMARY KEY
--ALTER TABLE NhanVien
--ADD FOREIGN KEY (MaCuaHang) REFERENCES CuaHang(MaCuaHang)

INSERT INTO [dbo].[CuaHang]
    VALUES  ('CH001',N'Thành phố Hồ Chí Minh','NV01',1), -- Cửa hàng chính, trụ sở
            ('CH002',N'Thành phố Vinh','NV02',1),
            ('CH003',N'Thành phố Hà Tĩnh','NV03',0),
            ('CH004',N'Thành phố Đà Nẵng','NV04',1),
            ('CH005',N'Thành phố Hà Nội','NV05',0)
GO

INSERT INTO [dbo].[LoaiHang]
	VALUES  ('ML001', N'Áo Thun', ' T-Shirt' ),
            ('ML002', N'Quần Kaki', ' Kaki pant' ),
            ('ML003', N'Áo Khoác', ' Jacket' ),
            ('ML004', N'Áo Sơ mi', ' shirt' ),
            ('ML005', N'Quần Jeans', ' jeans'),
            ('ML006', N'Đồ bộ', ' suit')
GO

INSERT INTO [dbo].[SanPham]
     VALUES ('SP001','Crypt Keeper Shirt','SKOOT',N'Hàng mới', 'ML004', 700000),
            ('SP002','Graveyard Pants','SKOOT',N'Quần nghĩa địa', 'ML002', 800000),
            ('SP003','Wasted Love Suit','SKOOT',N'Bộ đồ tình yêu lãng phí', 'ML006', 500000),
            ('SP004','Hollow Hoodie','SKOOT',N'Hoodie rỗng', 'ML003', 400000),
            ('SP005','Play Rough Bomber','SKOOT',N'Chơi máy bay ném bom thô bạo', 'ML005', 100000),
            ('SP006','Dead People T-shirt','SKOOT',N'Áo phông Người chết', 'ML001', 500000)
GO

INSERT INTO [dbo].[ChiTietCuaHang]
     VALUES ('CH001','SP001' ,1000),
            ('CH002','SP001' ,1000),
            ('CH001','SP002' ,1000),
            ('CH001','SP004' ,1000),
            ('CH005','SP001' ,1000)
GO
INSERT INTO [dbo].[HoaDonNhap]
     VALUES ('HDN001','SP001',110,2000,'NV01','2019-02-01',N'Ghi chú ','CH001'),
            ('HDN002','SP001',100,2000,'NV02','2019-02-26',N'Ghi chú ','CH002'),
            ('HDN003','SP001',120,2000,'NV03','2019-03-08',N'Ghi chú ','CH003'),
            ('HDN004','SP001',130,2000,'NV03','2019-05-05',N'Ghi chú ','CH004'),
            ('HDN005','SP001',100,2000,'NV01','2019-06-04',N'Ghi chú ','CH005')
GO
INSERT INTO [dbo].[HoaDonBanHang]
     VALUES
           ('HDB001','KH01','2020-12-24',N'Nội dung',1,'NV01','CH001', 1)
GO
INSERT INTO [dbo].[HoaDonChiTiet]
     VALUES ('HDB001','SP001',10,10000),
            ('HDB001','SP002',10,10000),
            ('HDB001','SP003',10,10000)
GO
/*
select * from HoaDonBanHang
GO
select HoaDonBanHang.MaHoaDonBanHang,NgayBan,MaNhanVien,MaCuaHang,MaSanPham,SoLuong from HoaDonBanHang right join HoaDonChiTiet
on HoaDonBanHang.MaHoaDonBanHang=HoaDonChiTiet.MaHoaDonBanHang
*/

/*select MaKhachHang from KHACHHANG where Month(NgaySinh)=month(GETDATE()) and
day(NgaySinh)=(day(GETDATE())+2)
*/

--cập nhật số lượng tồn kho cửa hàng từ hóa đơn nhập hàng
IF EXISTS (SELECT * FROM sys.triggers WHERE object_id = OBJECT_ID(N'[dbo].[trg_CapNhatTonKhoCuaHang_NhapHang]'))
DROP TRIGGER [dbo].[trg_CapNhatTonKhoCuaHang_NhapHang]
go
create trigger trg_CapNhatTonKhoCuaHang_NhapHang on HoaDonNhap
for insert,update
as begin
	IF (select MaSanPham from inserted) not in
		(select ct.MaSanPham from ChiTietCuaHang ct inner join inserted on inserted.MaCuaHang=ct.MaCuaHang )
		
		begin
			INSERT INTO ChiTietCuaHang 
					values
						( (select top 1 MaCuaHang from inserted where MaCuaHang=inserted.MaCuaHang), (select top 1 MaSanPham from inserted where MaCuaHang=inserted.MaCuaHang), 0);
			update ChiTietCuaHang set SoLuong= CH.SoLuong + (select SoLuong from inserted 
						where MaCuaHang= CH.MaCuaHang and MaSanPham=ch.MaSanPham )
						from ChiTietCuaHang CH join inserted  on CH.MaCuaHang=inserted.MaCuaHang 
						where CH.MaSanPham=inserted.MaSanPham
		end
	else
		begin
			update ChiTietCuaHang set SoLuong= CH.SoLuong + (select SoLuong from inserted 
						where MaCuaHang= CH.MaCuaHang and MaSanPham=ch.MaSanPham )
						from ChiTietCuaHang CH join inserted  on CH.MaCuaHang=inserted.MaCuaHang 
						where CH.MaSanPham=inserted.MaSanPham
		end
end

go
--cập nhật số lượng tồn kho cửa hàng từ hóa đơn CHI TIẾT Bán hàng
create trigger trg_CapNhatTonKhoCuaHang_BanHang on HoaDonChiTiet
for insert,update
as begin
	update ChiTietCuaHang set SoLuong= CH.SoLuong - (select SoLuong from inserted 
						where BH.MaCuaHang= CH.MaCuaHang and MaSanPham=CH.MaSanPham )
						from ChiTietCuaHang CH inner join HoaDonBanHang BH 
						on CH.MaCuaHang =BH.MaCuaHang inner join inserted
						on BH.MaHDBan=inserted.MaHDBan
						where CH.MaSanPham=inserted.MaSanPham
end

--hủy cập nhật số lượng tồn kho cửa hàng từ hóa đơn nhập hàng
GO
create trigger trg_HuyCapNhatTonKhoCuaHang_NhapHang on HoaDonNhap
for delete
as begin
	update ChiTietCuaHang set SoLuong= CH.SoLuong - (select SoLuong from deleted 
						where MaCuaHang= CH.MaCuaHang and MaSanPham=ch.MaSanPham )
						from ChiTietCuaHang CH join deleted  on CH.MaCuaHang=deleted.MaCuaHang 
						where CH.MaSanPham=deleted.MaSanPham
end

--hủy cập nhật số lượng tồn kho cửa hàng từ hóa đơn CHI TIẾT Bán hàng
GO
create trigger trg_HuyCapNhatTonKhoCuaHang_BanHang on HoaDonChiTiet
for delete
as begin
	update ChiTietCuaHang set SoLuong= CH.SoLuong + (select SoLuong from deleted 
						where BH.MaCuaHang= CH.MaCuaHang and MaSanPham=CH.MaSanPham )
						from ChiTietCuaHang CH inner join HoaDonBanHang BH 
						on CH.MaCuaHang =BH.MaCuaHang inner join deleted 
						on BH.MaHDBan=deleted.MaHDBan
						where CH.MaSanPham=deleted.MaSanPham
end 