public class Sistema {
    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double Nota1 = 8;
        double Nota2 = 7;
        double media = (Nota1 + Nota2) / 2;

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}