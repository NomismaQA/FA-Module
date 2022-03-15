package utilities;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;

public class GetRandomElementfromList 
{
	
	public WebElement getRandomElement(List<WebElement> agentOptions)
    {
        Random rand = new Random();
        return agentOptions.get(rand.nextInt(agentOptions.size()));
    }

}
