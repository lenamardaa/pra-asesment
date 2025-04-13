package soal3;
import java.util.Stack;
import java.util.LinkedList;
import java.util.List;

class BackForwardBrowser {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private List<String> history = new LinkedList<>();
    private String current = null;

    public void tambahData(String url) {
        if (current != null) {
            backStack.push(current);
        }
        current = url;
        forwardStack.clear();
        history.add(url);
        System.out.println("Website " + url + " dibuka");
    }

    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("Tidak bisa mundur, tidak ada halaman sebelumnya.");
            return;
        }

        forwardStack.push(current);
        current = backStack.pop();
        System.out.println("Mundur ke alamat " + current);
    }

    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Tidak bisa maju, tidak ada halaman selanjutnya.");
            return;
        }

        backStack.push(current);
        current = forwardStack.pop();
        System.out.println("Kembali lagi ke alamat " + current);
    }

    public void history() {
        System.out.println("History penelusuran web:");
        System.out.println(history);
    }
}
