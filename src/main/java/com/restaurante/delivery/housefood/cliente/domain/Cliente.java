package com.restaurante.delivery.housefood.cliente.domain;


import com.restaurante.delivery.housefood.cliente.endereco.Endereco;
import com.restaurante.delivery.housefood.cliente.request.AtualizaClienteRequest;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import com.restaurante.delivery.housefood.pedidos.domain.Pedido;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String cpf;
    private String email;
    @Embedded
    private Endereco endereco;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente(ClienteRequest clienteRequest) {
        this.id = clienteRequest.getIdCliente();
        this.nome = clienteRequest.getNome();
        this.cpf = clienteRequest.getCpf();
        this.email = clienteRequest.getEmail();
        this.endereco = new Endereco(clienteRequest.getEndereco());
        this.pedidos = new ArrayList<Pedido>(clienteRequest.getPedidos());
    }


    public void altera(AtualizaClienteRequest request) {

        this.email= request.getEmail();

        this.endereco.altera(new Endereco(request.getEndereco()));
        this.pedidos = request.getPedidos();

    }
}