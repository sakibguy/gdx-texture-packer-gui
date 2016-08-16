package com.crashinvaders.texturepackergui.config;

import com.crashinvaders.texturepackergui.config.attributes.*;
import com.github.czyzby.lml.vis.parser.impl.VisLmlSyntax;
import com.crashinvaders.texturepackergui.config.tags.FixedFloatSpinnerLmlTagProvider;
import com.crashinvaders.texturepackergui.config.tags.FixedIntSpinnerLmlTagProvider;
import com.crashinvaders.texturepackergui.views.canvas.Canvas;

public class AppLmlSyntax extends VisLmlSyntax {

    @Override
    protected void registerActorTags() {
        super.registerActorTags();

        addTagProvider(new Canvas.CanvasLmlTagProvider(), "canvas");
        addTagProvider(new FixedIntSpinnerLmlTagProvider(), "intSpinner");
        addTagProvider(new FixedFloatSpinnerLmlTagProvider(), "floatSpinner");
    }

    @Override
    protected void registerCommonAttributes() {
        super.registerCommonAttributes();

        addAttributeProcessor(new OnRightClickLmlAttribute(), "onRightClick", "rightClick");
        addAttributeProcessor(new ImageDrawableLmlAttribute(), "image", "drawable");
    }

    @Override
    protected void registerTableAttributes() {
        super.registerTableAttributes();

        addAttributeProcessor(new TableTiledBackgroundLmlAttribute(), "bgTiled", "backgroundTiled");
    }

    @Override
    protected void registerContainerAttributes() {
        super.registerContainerAttributes();

        addAttributeProcessor(new ContainerPadLeftLmlAttribute(), "padLeft");
        addAttributeProcessor(new ContainerPadRightLmlAttribute(), "padRight");
        addAttributeProcessor(new ContainerPadTopLmlAttribute(), "padTop");
        addAttributeProcessor(new ContainerPadBottomLmlAttribute(), "padBottom");
    }
}
