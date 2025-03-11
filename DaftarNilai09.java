public class DaftarNilai09 {
    String nama;
    int nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    DaftarNilai09(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    static int cariMaxUTS(int arr[], int left, int right) {
        if (left == right) {
            return arr[left];
        }
        
        int mid = (left + right) / 2;
        int maxLeft = cariMaxUTS(arr, left, mid);
        int maxRight = cariMaxUTS(arr, mid + 1, right);
        
        return Math.max(maxLeft, maxRight);
    }

    static int cariMinUTS(int arr[], int left, int right) {
        if (left == right) {
            return arr[left];
        }
        
        int mid = (left + right) / 2;
        int minLeft = cariMinUTS(arr, left, mid);
        int minRight = cariMinUTS(arr, mid + 1, right);
        
        return Math.min(minLeft, minRight);
    }

    static double hitungRerataUAS(int arr[]) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return (double) total / arr.length;
    }
}