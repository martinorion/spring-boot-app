package com.appslab.springbootapp.Model;

import com.appslab.springbootapp.ACompany.ACompany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_EMPLOYEE",
        discriminatorType = DiscriminatorType.STRING)
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
   //@Column(name = "imd_id")
    private Integer id;

    /*  Pokial nepouzijes @Column anotaciu kde zadefinujes name tak Hibernate pouzije pre nazov
        stlpca nazov atributu. Cize v tomto pripade atribut employeeType namapovalo na EMPLOYEE_TYPE.
        Lenze v @DiscriminatorColumn anotacii si zadefinoval ze ten dicriminator column sa ma volat
        TYPE_EMPLOYEE. Takze ti to v tabulke Employee vytvorilo zbytocne 2 stlpce - EMPLOYEE_TYPE
        a TYPE_EMPLOYEE pricom potrebujes iba jeden. Takze bud pridas @Column anotaciu so spravnym
        name alebo nastavis spravne name v @DiscriminatorColumn. Ja som pridal @Column anotaciu.
        To insertable/updateable false je tam preto, ze inak mi to davalo MappingException: Repeated
        column in mapping for entity:.. . Uprimne, ani mne to nie je uplne jasne, ale tu niekto
        pise preco to tak je: https://stackoverflow.com/a/53796697/8900927
    */
    @Column(name = "TYPE_EMPLOYEE", insertable = false, updatable = false)
    @Enumerated(value = EnumType.STRING)
    private  EmployeeType employeeType;

  public Employee(){}

  /*  public Employee(EmployeeType employeeType){
        this.employeeType = employeeType;
    }*/

    float salary;
    int bonus;

   public Employee(EmployeeType employeeType, float salary, int bonus){
        this.employeeType = employeeType;
        this.salary = salary;
        this.bonus = bonus;
    }

   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id", referencedColumnName = "emp_id")
    private ACompany aCompany;*/


/*    @ManyToOne
    private ACompany aCompany;*/

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = ACompany.class)
    @JoinColumn(name = "companyId", insertable = false, updatable = false)
    private ACompany aCompany;

    /*  tie stlpce sa mozu volat rovnako, pretoze inak by ti vytvorilo zbytocne 2 stlpce v tabulke.
        Takto to vytvori len jeden, do ktoreho bude ukladat company id a ktory tiez pouzije pri
        definovani toho vztahu medzi Employee a ACompany.
    */
    @Column(name = "companyId")
    private Integer companyId;


    /*
    public void getInfo(){
        System.out.println(employeeType.name + "’s salary is " + salary + " and bonus is " + bonus);
    }
*/

}

