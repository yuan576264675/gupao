package cn.yuan.gupao.designmode.factory.three.abstractfactory;


/**
 * @author chenjiangfeng
 * @Description:
 * @Date : 2019/3/17 14 27
 */
public class LongjingTeaPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public LongjingTeaPizza(PizzaIngredientFactory ingredientFactory) {
        this.pizzseType="西湖龙井披萨";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepeare() {
        System.out.println("Preparing" + pizzseType);
        this.cheese = ingredientFactory.createCheese();
        this.dough = ingredientFactory.createDough();
        this.clam = ingredientFactory.createClam();
        this.sauce = ingredientFactory.createSauce();
    }

    public void setIngredientFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
}
