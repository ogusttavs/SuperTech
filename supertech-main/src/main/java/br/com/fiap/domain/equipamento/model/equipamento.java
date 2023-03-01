package br.com.fiap.domain.equipamento.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_equipamento")
public class equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EQUIPAMENTO")
    @SequenceGenerator(name = "SQ_EQUIPAMENTO",
            sequenceName = "SQ_EQUIPAMENtO",
            allocationSize = 20,
            initialValue = 1

    )
    @Column(name = "id_equipamento" )
    private Long id;
    @Column(name = "NM_EQUIPAMENTO")
    private String nome;

    @Column(name = "NM_SERIE_EQUIPAMENTO")
    private String numeroDeSerie;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_tp_equipamento",
    referencedColumnName = "id_tp_equipamento",
    foreignKey = @ForeignKey(name = "fk_tb_tp_equipamento",
                            value = ConstraintMode.CONSTRAINT))
    private TipoEquipamento tipo;

    public equipamento(Long id, String nome, String numeroDeSerie) {
        this.id = id;
        this.nome = nome;
        this.numeroDeSerie = numeroDeSerie;
    }
    public equipamento(){

    }

    public Long getId() {
        return id;
    }

    public equipamento setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public equipamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public equipamento setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
        return this;
    }

    @Override
    public String toString() {
        return "equipamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroDeSerie='" + numeroDeSerie + '\'' +
                '}';
    }
}
