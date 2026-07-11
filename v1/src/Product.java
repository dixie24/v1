@Entity
@Data
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String comment;
}{
}
