package br.com.fiap.domain.equipamento.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tp_equipamento")

public class TipoEquipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tp_equipamento")
    @SequenceGenerator(name = "seq_tp_equipamento", allocationSize = 1)
    @Column(name = "id_tp_equipamento")
    private Long id;
    @Column(name = "nm_tp_equipamento")
    private String nome;
    public TipoEquipamento() {}

    public TipoEquipamento(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public TipoEquipamento setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoEquipamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "TipoEquipamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }


}
