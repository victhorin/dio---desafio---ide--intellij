package br.com.dio;

import br.com.dio.gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        gato gt = new gato();
        System.out.println(gt);

        livro lv = new livro();
        System.out.println(lv);

       /* int a = 5;
        int b = 6;

        System.out.println("Hello World " + (a + b));
*/


    } static class livro {
        private String nome;
        private int npag;

        public livro(String nome, int npag) {
            this.nome = nome;
            this.npag = npag;
        }

        public livro() {

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getNpag() {
            return npag;
        }

        public void setNpag(int npag) {
            this.npag = npag;
        }

        @Override
        public String toString() {
            return "livro{" +
                    "nome='" + nome + '\'' +
                    ", npag=" + npag +
                    '}';
        }
    }



}
