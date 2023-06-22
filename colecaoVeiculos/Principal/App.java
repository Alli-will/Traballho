package Principal;

import java.util.ArrayList;

import ColecaoVeiculo.ColecaoVeiculos;
import Enum.enumMarca;
import Veiculoo.Veiculo;

public class App {
    public static void main(String[] args) {
        ColecaoVeiculos colecao = new ColecaoVeiculos();

        
        colecao.addVeiculoMarca(enumMarca.VOLKSWAGEN, new Veiculo("VW Gol GTI 2000"));
        colecao.addVeiculoMarca(enumMarca.VOLKSWAGEN, new Veiculo("VW Gol GTS 1800"));
        colecao.addVeiculoMarca(enumMarca.VOLKSWAGEN, new Veiculo("VW Golf SAPÃO"));
        colecao.addVeiculoMarca(enumMarca.VOLKSWAGEN, new Veiculo("VW Voyage"));

        colecao.addVeiculoMarca(enumMarca.FORD, new Veiculo("Ford Fiesta"));
        colecao.addVeiculoMarca(enumMarca.FORD, new Veiculo("Ford Focus"));
        colecao.addVeiculoMarca(enumMarca.FORD, new Veiculo("Ford Mustang"));
        colecao.addVeiculoMarca(enumMarca.FORD, new Veiculo("Ford GT40"));

        colecao.addVeiculoMarca(enumMarca.GM, new Veiculo("GM Celta"));
        colecao.addVeiculoMarca(enumMarca.GM, new Veiculo("GM Onix"));
        colecao.addVeiculoMarca(enumMarca.GM, new Veiculo("GM Cruze"));
        colecao.addVeiculoMarca(enumMarca.GM, new Veiculo("GM Camaro"));

        colecao.addVeiculoMarca(enumMarca.RENAULT, new Veiculo("Renault Sandero RS"));
        colecao.addVeiculoMarca(enumMarca.RENAULT, new Veiculo("Renault Clio "));
        colecao.addVeiculoMarca(enumMarca.RENAULT, new Veiculo("Renault Kwid"));
        colecao.addVeiculoMarca(enumMarca.RENAULT, new Veiculo("Renault Sport RS"));

        colecao.addVeiculoMarca(enumMarca.Ferrari, new Veiculo("Ferrari Enzo"));
        colecao.addVeiculoMarca(enumMarca.Ferrari, new Veiculo("Ferrari 458 "));
        colecao.addVeiculoMarca(enumMarca.Ferrari, new Veiculo("Ferrari F450 "));
        colecao.addVeiculoMarca(enumMarca.Ferrari, new Veiculo("Ferrari LaFerrari "));

        colecao.addVeiculoMarca(enumMarca.LAMBORGHINI, new Veiculo("LAMBORGHINI Egoista"));
        colecao.addVeiculoMarca(enumMarca.LAMBORGHINI, new Veiculo("LAMBORGHINI Terzo Millennio "));
        colecao.addVeiculoMarca(enumMarca.LAMBORGHINI, new Veiculo("LAMBORGHINI Aventador Sv "));
        colecao.addVeiculoMarca(enumMarca.LAMBORGHINI, new Veiculo("LAMBORGHINI Huracan "));


    
        ArrayList<Veiculo> veiculosFiltradosVW = colecao.filtroMarca(enumMarca.VOLKSWAGEN, "VW");
        System.out.println("Veículos da marca VOLKSWAGEN filtrados por 'VW':");
        for (Veiculo veiculo : veiculosFiltradosVW) {
        System.out.println(String.format("- %s%s%s", "\u001B[34m", veiculo.getNome(), "\u001B[0m"));
}

        ArrayList<Veiculo> veiculosFiltradosFord = colecao.filtroMarca(enumMarca.FORD, "Ford");
        System.out.println("Veículos da marca Ford filtrados por 'Ford':");
        for (Veiculo veiculo : veiculosFiltradosFord) {
        System.out.println(String.format("- %s%s%s", "\u001B[34m", veiculo.getNome(), "\u001B[0m"));
}

        ArrayList<Veiculo> veiculosFiltradosGM = colecao.filtroMarca(enumMarca.GM, "GM");
        System.out.println("Veículos da marca GM filtrados por 'GM':");
        for (Veiculo veiculo : veiculosFiltradosGM) {
        System.out.println(String.format("- %s%s%s", "\u001B[34m", veiculo.getNome(), "\u001B[0m"));
}

        ArrayList<Veiculo> veiculosFiltradosRenault = colecao.filtroMarca(enumMarca.RENAULT, "Renault");
        System.out.println("Veículos da marca Renault filtrados por 'Renault':");
        for (Veiculo veiculo : veiculosFiltradosRenault) {
        System.out.println(String.format("- %s%s%s", "\u001B[34m", veiculo.getNome(), "\u001B[0m"));
}

        ArrayList<Veiculo> veiculosFiltradosFerrari = colecao.filtroMarca(enumMarca.Ferrari, "Ferrari");
        System.out.println("Veículos da marca Ferrari filtrados por 'Ferrari':");
        for (Veiculo veiculo : veiculosFiltradosFerrari) {
        System.out.println(String.format("- %s%s%s", "\u001B[34m", veiculo.getNome(), "\u001B[0m"));
}
        ArrayList<Veiculo> veiculosFiltradosLAMBORGHINI = colecao.filtroMarca(enumMarca.LAMBORGHINI, "LAMBORGHINI");
        System.out.println("Veículos da marca LAMBORGHINI filtrados por 'LAMBORGHINI':");
        for (Veiculo veiculo : veiculosFiltradosLAMBORGHINI) {
        System.out.println(String.format("- %s%s%s", "\u001B[34m", veiculo.getNome(), "\u001B[0m"));
 }
    }

}


