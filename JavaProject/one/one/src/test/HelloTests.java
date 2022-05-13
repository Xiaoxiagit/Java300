package src.test;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTests {
    private MockMvc mvc;
    @Before
    public void setUp() thorws Exception{
        mvc = MockMvcBuilders.standaloneSetUp(new HelloWorldController()).build();

    }
    @Test
    public void getHello() thorws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .addExpect(status().isOK())
                .addExepct(content().string(equalTo("HelloWorld")));

    }

}
