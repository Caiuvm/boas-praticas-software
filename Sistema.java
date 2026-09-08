public class Sistema {

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double Nota1 = 8;
        double Nota2 = 7;

        double media = calcularMedia(Nota1, Nota2);
        String situacao = verificarSituacao(media);

        apresentarResultados(nomeAluno, media, situacao);
    }

    public static double calcularMedia(double Nota1, double Nota2) {
        return (Nota1 + Nota2) / 2;
    }

    public static String verificarSituacao(double media) {
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void apresentarResultados(String nomeAluno, double media, String situacao) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println(situacao);
    }
}