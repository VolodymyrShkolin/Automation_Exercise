package core;

import org.openqa.selenium.WebDriver;

public abstract class BaseStep extends BaseSelenium{
    protected final PageProvider pages;
    protected final  StepFactory steps;

    protected BaseStep(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver);
        this.pages = pages;
        this.steps = steps;
    }
}
