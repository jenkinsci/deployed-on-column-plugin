package jenkins;

import org.junit.Assert;
import org.junit.Test;

import jenkins.plugins.deployedoncolumn.DeployedOnColumn;

public class DeployedOnColumnTest {
    @Test
    public void isAbsoluteDummy() {
        Assert.assertFalse(new DeployedOnColumn().isAbsolute("seriously"));
    }
}
