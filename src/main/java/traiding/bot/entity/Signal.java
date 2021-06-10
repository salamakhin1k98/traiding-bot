package traiding.bot.entity;

import lombok.Getter;
import lombok.Setter;
import traiding.bot.entity.enums.MethodType;
import traiding.bot.entity.enums.TimeFrame;
import traiding.bot.entity.enums.TypeOperation;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "all_signals")
public class Signal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private Long id;

    @Column(name = "s_date")
    private Date date = new Date();

    @Column(name = "s_time_frame")
    @Enumerated(EnumType.STRING)
    private TimeFrame timeFrame;

    @Column(name = "s_method_type")
    @Enumerated(EnumType.STRING)
    private MethodType methodType;

    @Column(name = "s_type_operation")
    @Enumerated(EnumType.STRING)
    private TypeOperation typeOperation;

    @Column(name = "s_currency_name")
    private String currencyName;

    @Column(name = "s_currency_value")
    private Double currencyValue;

}
