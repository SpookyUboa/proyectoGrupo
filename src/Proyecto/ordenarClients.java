package Proyecto;

public class ordenarClients {
    public void ordenar(int[][] codigos, String[][] clientes) {
        String[] cambio;
        for (int i = 0; i < clientes.length; i++) {
            for (int j = i +1 ; j < clientes.length; j++) {
                if (clientes[i][2].compareTo(clientes[j][2])<0) {
                    cambio=clientes[i];
                    clientes[i]=clientes[j];
                    clientes[j]=cambio;
                }
            }
        }
    }

}

