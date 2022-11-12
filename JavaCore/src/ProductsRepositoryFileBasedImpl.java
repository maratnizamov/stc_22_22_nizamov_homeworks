import java.io.*;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductsRepositoryFileBasedImpl implements ProductsRepository {
    private final String fileName;
    public ProductsRepositoryFileBasedImpl(String fileName) {
        this.fileName = fileName;
    }
    private static final Function<String, Product> stringToProductMapper = currentProduct -> {
        String[] parts = currentProduct.split("\\|");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        double price = Double.parseDouble(parts[2]);
        int count = Integer.parseInt(parts[3]);
        return new Product(id, name, price, count);
    };
    @Override
    public Product findById(Integer id) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            return bufferedReader
                    .lines()
                    .map(stringToProductMapper)
                    .filter(Objects::nonNull)
                    .filter(Product -> Product.getId() == id)
                    .findFirst()
                    .get();
        } catch (IOException e) {
            throw new UnsuccessfulWorkWithFileException(e);
        }
    }
    @Override
    public List<Product> findAllByTitleLike(String title) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            return bufferedReader
                    .lines()
                    .map(stringToProductMapper)
                    .filter(Objects::nonNull)
                    .filter(Product -> Product.getName().toLowerCase().contains(title.toLowerCase()))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new UnsuccessfulWorkWithFileException(e);
        }
    }
}