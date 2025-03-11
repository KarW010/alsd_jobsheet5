public class MainDaftarNilai09 {
    public static void main(String[] args){
        DaftarNilai09[] mahasiswa = {
            new DaftarNilai09("Ahmad", 220101001, 2022, 78, 82),
            new DaftarNilai09("Budi", 220101002, 2022, 85, 88),
            new DaftarNilai09("Cindy", 220101003, 2021, 90, 87),
            new DaftarNilai09("Dian", 220101004, 2023, 76, 79),
            new DaftarNilai09("Eko", 220101005, 2023, 92, 95),
            new DaftarNilai09("Fajar", 220101006, 2022, 88, 85),
            new DaftarNilai09("Gina", 220101007, 2021, 86, 87),
            new DaftarNilai09("Hadi", 220101008, 2020, 82, 84),
        };

        int n = mahasiswa.length;
        int[] nilaiUTS = new int[n];
        int[] nilaiUAS = new int[n];

        for(int i = 0; i < n; i++){
            nilaiUTS[i] = mahasiswa[i].nilaiUTS;
            nilaiUAS[i] = mahasiswa[i].nilaiUAS;
        }

        int maxUTS = DaftarNilai09.cariMaxUTS(nilaiUTS, 0, n - 1);
        int minUTS = DaftarNilai09.cariMinUTS(nilaiUTS, 0, n - 1);
        double rerataUAS = DaftarNilai09.hitungRerataUAS(nilaiUAS);

        System.out.println("Nilai UTS Tertinggi: " + maxUTS);
        System.out.println("Nilai UTS Terendah: " + minUTS);
        System.out.println("Rata-rata Nilai UAS: " + rerataUAS);
    }
}