@Entity
@Data
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;
    private String name;
    private Double price;
    private String comment;
}{
}
