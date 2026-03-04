package serializacao;

import model.Estado;

import java.io.IOException;

public class TestaDesserializa {

    public static void main(String[] args) {

        SerializadorUtil serializador = new SerializadorUtil();

        try {
            Estado estado = (Estado) serializador.desserializa("estado.dat");
            System.out.println(estado.getNome());
            System.out.println(estado.getSigla());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
