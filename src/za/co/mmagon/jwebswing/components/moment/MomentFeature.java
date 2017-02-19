/* 
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.components.moment;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @since 2013/01/16
 * @version 1.0
 */
public class MomentFeature extends Feature<MomentOptions, MomentFeature> implements MomentFeatures, GlobalFeatures
{

    private static final long serialVersionUID = 1L;
    private MomentOptions options;

    /**
     * Constructs a feature for
     * <p>
     * @param forComponent
     */
    public MomentFeature(Component forComponent)
    {
        super("MomentJS");
        forComponent.getAngularModules().add(new MomentAngularModule(forComponent));
        setComponent(forComponent);
        getJavascriptReferences().add(MomentReferencePool.MomentReference.getJavaScriptReference());
        getJavascriptReferences().add(MomentReferencePool.MomentAngularReference.getJavaScriptReference());
    }

    @Override
    public void preConfigure()
    {
        super.preConfigure();
    }

    /**
     * No Options
     * <p>
     * @return
     */
    @Override
    public MomentOptions getOptions()
    {
        if (options == null)
        {
            options = new MomentOptions();
        }
        return options;
    }

    @Override
    public void assignFunctionsToComponent()
    {
    }
}
