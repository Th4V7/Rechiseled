package com.supermartijn642.rechiseled.screen;

import com.mojang.blaze3d.platform.GlStateManager;
import com.supermartijn642.core.TextComponents;
import com.supermartijn642.core.gui.ScreenUtils;
import com.supermartijn642.core.gui.widget.AbstractButtonWidget;
import com.supermartijn642.core.gui.widget.IHoverTextWidget;
import com.supermartijn642.rechiseled.chiseling.ChiselingEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

import java.util.function.Supplier;

/**
 * Created 26/12/2021 by SuperMartijn642
 */
public class ConnectingToggleWidget extends AbstractButtonWidget implements IHoverTextWidget {

    private static final ResourceLocation GREY_BUTTONS = new ResourceLocation("rechiseled", "textures/screen/grey_buttons.png");
    private static final ResourceLocation ICON_CONNECTED_ON = new ResourceLocation("rechiseled", "textures/screen/icon_connecting_true.png");
    private static final ResourceLocation ICON_CONNECTED_OFF = new ResourceLocation("rechiseled", "textures/screen/icon_connecting_false.png");

    private final Supplier<Boolean> connecting;
    private final Supplier<ChiselingEntry> currentEntry;

    public ConnectingToggleWidget(int x, int y, int width, int height, Supplier<Boolean> connecting, Supplier<ChiselingEntry> currentEntry, Runnable onPress){
        super(x, y, width, height, onPress);
        this.connecting = connecting;
        this.currentEntry = currentEntry;
    }

    @Override
    protected ITextComponent getNarrationMessage(){
        return this.getHoverText();
    }

    @Override
    public ITextComponent getHoverText(){
        boolean connecting = this.connecting.get();
        ChiselingEntry currentEntry = this.currentEntry.get();
        boolean canSwitch = currentEntry != null && (connecting ? currentEntry.hasRegularItem() : currentEntry.hasConnectingItem());
        return canSwitch ? TextComponents.translation("rechiseled.chiseling.connecting", TextComponents.translation("rechiseled.chiseling.connecting." + (connecting ? "on" : "off")).color(TextFormatting.GOLD).get()).get() : null;
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks){
        boolean connecting = this.connecting.get();
        ChiselingEntry currentEntry = this.currentEntry.get();
        boolean canSwitch = currentEntry != null && (connecting ? currentEntry.hasRegularItem() : currentEntry.hasConnectingItem());

        ScreenUtils.bindTexture(GREY_BUTTONS);
        ScreenUtils.drawTexture(this.x, this.y, this.width, this.height, 0, (canSwitch ? this.hovered ? 2 : 0 : 1) / 3f, 1, 1 / 3f);

        GlStateManager.enableAlphaTest();
        ScreenUtils.bindTexture(this.connecting.get() ? ICON_CONNECTED_ON : ICON_CONNECTED_OFF);
        ScreenUtils.drawTexture(this.x + 1, this.y + 2, this.width - 2, this.height - 4);
    }
}
