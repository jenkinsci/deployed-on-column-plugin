package jenkins;

import org.junit.Assert;
import org.junit.Test;

import jenkins.plugins.deployedoncolumn.DeployedOnColumn;

public class DeployedOnColumnTest {
    @Test
    public void isAbsolute() {
        Assert.assertTrue(new DeployedOnColumn().isAbsolute("/"));
    }
}
