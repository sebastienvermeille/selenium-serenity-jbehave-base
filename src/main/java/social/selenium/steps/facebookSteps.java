package social.selenium.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import social.selenium.page.facebook.fbDashboard;
import social.selenium.page.facebook.fbLanding;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class facebookSteps extends ScenarioSteps {
	fbLanding landingPage;
	fbDashboard dashboardPage;

	public facebookSteps(Pages pages) {
		super(pages);
	}


	@Step
	public void open_landing_page(){
		landingPage.open();
	}

	@Step
	public void login_with_user_and_pass(String username,String password){
		assertThat(username,not(password));
		landingPage.login(username, password);
	}

}
