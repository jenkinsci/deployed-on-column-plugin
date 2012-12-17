/*
 * The MIT License
 *
 * Copyright (c) 2011-2012, CloudBees, Inc., Stephen Connolly.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package jenkins.plugins.deployedoncolumn;

import hudson.model.Action;

import java.io.Serializable;

/**
 * {@link Action} that contributes an icon to the "Deployed on" column.
 *
 * <p>
 * This can be implemented by {@link Action}s that associate themselves
 * with {@link hudson.model.Build}.
 *
 * <p>
 * Actions with this marker should have a icons in the three sizes
 * required by the standard views, i.e. 16x16, 24x24 and 32x32.
 *
 * @author stephenc
 * @since 1.0
 */
public interface DeployedOnAction extends Action, Serializable {
    /**
     * Returns the URL to the image.
     *
     * @param size
     *      The size specified. Must support "16x16", "24x24", and "32x32" at least.
     *      For forward compatibility, if you receive a size that's not supported,
     *      consider returning your biggest icon (and let the browser rescale.)
     * @return
     *      The URL is rendered as is in the img @src attribute, so it must contain
     *      the context path, etc.
     */
    String getImageOf(String size);

    /**
     * Gets the human-readable description used as img/@alt.
     */
    String getDescription();

}
