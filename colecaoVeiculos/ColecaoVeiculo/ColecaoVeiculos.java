package ColecaoVeiculo;

import java.util.ArrayList;
import java.util.EnumMap;

import Enum.enumMarca;
import Veiculoo.Veiculo;

public class ColecaoVeiculos {
     private EnumMap<enumMarca, ArrayList<Veiculo>> mapaVeiculos;

    public ColecaoVeiculos() {
        mapaVeiculos = new EnumMap<>(enumMarca.class);
    }

    public void addVeiculoMarca(enumMarca marca, Veiculo veiculo) {
        ArrayList<Veiculo> veiculos = mapaVeiculos.getOrDefault(marca, new ArrayList<>());
        veiculos.add(veiculo);
        mapaVeiculos.put(marca, veiculos);
    }

    public ArrayList<Veiculo> filtroMarca(enumMarca marca, String filtro) {
        ArrayList<Veiculo> filtrados = new ArrayList<>();
        if (mapaVeiculos.containsKey(marca)) {
            for (Veiculo veiculo : mapaVeiculos.get(marca)) {
                if (veiculo.getNome().toUpperCase().contains(filtro.toUpperCase())) {
                    filtrados.add(veiculo);
                }
            }
        }
        return filtrados;
    }

    public ArrayList<Veiculo> filtroGeral(String filtro) {
        ArrayList<Veiculo> filtrados = new ArrayList<>();
        for (enumMarca marca : mapaVeiculos.keySet()) {
            ArrayList<Veiculo> veiculosMarca = filtroMarca(marca, filtro);
            for (Veiculo veiculo : veiculosMarca) {
                if (!filtrados.contains(veiculo)) {
                    filtrados.add(veiculo);
                }
            }
        }
        return filtrados;
    }
    

}
