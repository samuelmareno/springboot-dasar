package id.mareno.belajarspringdasar;

import id.mareno.belajarspringdasar.data.MultiFoo;
import id.mareno.belajarspringdasar.repository.CategoryRepository;
import id.mareno.belajarspringdasar.repository.CustomerRepository;
import id.mareno.belajarspringdasar.repository.ProductRepository;
import id.mareno.belajarspringdasar.service.CategoryService;
import id.mareno.belajarspringdasar.service.CustomerService;
import id.mareno.belajarspringdasar.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Samuel Mareno
 * @Date 23/04/22
 */
public class ComponentTest {

    ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertNotNull(productService1);
        Assertions.assertNotNull(productService2);
        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void constructorDependencyInjection() {
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        ProductService productService = applicationContext.getBean(ProductService.class);

        Assertions.assertSame(productService.getProductRepository(), productRepository);
    }

    @Test
    void testSetterDependencyInjection() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryService.getCategoryRepository(), categoryRepository);
    }

    @Test
    void testFieldDependencyInjection() {
        CustomerRepository normalCustomerRepository = applicationContext
                .getBean("normalCustomerRepository", CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = applicationContext
                .getBean("premiumCustomerRepository", CustomerRepository.class);
        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        Assertions.assertSame(customerService.getPremiumCustomerRepository(), premiumCustomerRepository);
        Assertions.assertSame(customerService.getNormalCustomerRepository(), normalCustomerRepository);
    }

    @Test
    void testObjectProvider() {
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);
        Assertions.assertEquals(3, multiFoo.getFoos().size());
    }
}
