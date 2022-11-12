public class Main {
    public static void main(String[] args) {
        ProductsRepository productsRepository = new ProductsRepositoryFileBasedImpl("Store.txt");
        System.out.println(productsRepository.findById(3).toString());
        System.out.println(productsRepository.findAllByTitleLike("шОкОлАД"));
        System.out.println(productsRepository.findAllByTitleLike("ол"));
    }
}