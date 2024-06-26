-- a. Data barang dengan harga lebih besar dari 10000 diurutkan berdasarkan Harga (ascending)
SELECT nama, harga
FROM barang
WHERE harga > 10000
ORDER BY harga ASC;

-- b. Data Pelanggan yang namanya mengandung huruf "g" dengan alamat "Bandung"
SELECT nama, alamat
FROM pelanggan
WHERE nama LIKE '%g%' AND alamat LIKE '%Bandung%';

--c
SELECT t.kode, t.tanggal, p.nama, b.nama, jumlah_barang as jumlah, b.harga, (b.harga*t.jumlah_barang) as total
FROM transaksi as t 
JOIN pelanggan as p ON t.kode_pelanggan = p.kode
JOIN barang as b ON t.kode_barang = b.kode
ORDER BY p.nama ASC;

--d
SELECT p.nama, SUM(t.jumlah_barang) as jumlah, SUM(t.jumlah_barang*b.harga) as total
FROM transaksi as t
JOIN pelanggan as p ON t.kode_pelanggan= p.kode
JOIN barang as b ON t.kode_barang=b.kode
ORDER BY nama ASC;
