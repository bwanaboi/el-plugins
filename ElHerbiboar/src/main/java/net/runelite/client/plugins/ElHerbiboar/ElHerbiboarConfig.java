/*
 * Copyright (c) 2017, Tyler <https://github.com/tylerthardy>
 * Copyright (c) 2019, Gamer1120 <https://github.com/Gamer1120>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.ElHerbiboar;

import java.awt.Color;

import net.runelite.client.config.*;

@ConfigGroup("ElHerbiboar")
public interface ElHerbiboarConfig extends Config
{
	@ConfigTitleSection(
		keyName = "objectsTitle",
		name = "Objects",
		description = "",
		position = 0
	)
	default Title objectsTitle()
	{
		return new Title();
	}

	@ConfigTitleSection(
		keyName = "trailTitle",
		name = "Trail",
		description = "",
		position = 1
	)
	default Title trailTitle()
	{
		return new Title();
	}

	@ConfigTitleSection(
		keyName = "colorsTitle",
		name = "Colors",
		description = "",
		position = 2
	)
	default Title colorsTitle()
	{
		return new Title();
	}

	@ConfigItem(
		position = 0,
		keyName = "showStart",
		name = "Show Start Objects",
		description = "Show highlights for starting rocks and logs",
		titleSection = "objectsTitle"
	)
	default boolean isStartShown()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "showClickboxes",
		name = "Show Clickboxes",
		description = "Show clickboxes on trail objects and tunnels instead of tiles",
		titleSection = "objectsTitle"
	)
	default boolean showClickBoxes()
	{
		return false;
	}

	@ConfigItem(
		position = 2,
		keyName = "showTunnel",
		name = "Show End Tunnels",
		description = "Show highlights for tunnels with herbiboars",
		titleSection = "objectsTitle"
	)
	default boolean isTunnelShown()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "showObject",
		name = "Show Trail Objects",
		description = "Show highlights for mushrooms, mud, seaweed, etc",
		titleSection = "objectsTitle"
	)
	default boolean isObjectShown()
	{
		return true;
	}

	@ConfigItem(
		position = 0,
		keyName = "showTrail",
		name = "Show Trail",
		description = "Show highlights for trail prints",
		titleSection = "trailTitle"
	)
	default boolean isTrailShown()
	{
		return true;
	}

	@ConfigItem(
		position = 0,
		keyName = "colorStart",
		name = "Start Color",
		description = "Color for rocks that start the trails",
		titleSection = "colorsTitle"
	)
	default Color getStartColor()
	{
		return Color.CYAN;
	}

	@ConfigItem(
		position = 1,
		keyName = "colorTunnel",
		name = "Tunnel Color",
		description = "Color for tunnels with herbiboars",
		titleSection = "colorsTitle"
	)
	default Color getTunnelColor()
	{
		return Color.GREEN;
	}

	@ConfigItem(
		position = 2,
		keyName = "colorGameObject",
		name = "Trail Object Color",
		description = "Color for mushrooms, mud, seaweed, etc",
		titleSection = "colorsTitle"
	)
	default Color getObjectColor()
	{
		return Color.CYAN;
	}

	@ConfigItem(
		position = 3,
		keyName = "colorTrail",
		name = "Trail Color",
		description = "Color for mushrooms, mud, seaweed, etc",
		titleSection = "colorsTitle"
	)
	default Color getTrailColor()
	{
		return Color.WHITE;
	}

	@ConfigTitleSection(
			keyName = "delayTitle",
			name = "Delay Config",
			description = "",
			position = 40
	)
	default Title delayTitle()
	{
		return new Title();
	}

	@ConfigItem(
			keyName = "customDelays",
			name = "Use Custom Delays",
			description = "Click here to use custom delays",
			position = 40,
			titleSection = "delayTitle"
	)
	default boolean customDelays()
	{
		return false;
	}

	@ConfigItem(
			keyName = "sleepMin",
			name = "Sleep Min",
			description = "Enter minimum sleep delay here.",
			position = 41,
			titleSection = "delayTitle",
			hidden=true,
			unhide="customDelays"
	)
	default int sleepMin()
	{
		return 60;
	}

	@ConfigItem(
			keyName = "sleepMax",
			name = "Sleep Max",
			description = "Enter maximum sleep delay here.",
			position = 42,
			titleSection = "delayTitle",
			hidden=true,
			unhide="customDelays"
	)
	default int sleepMax()
	{
		return 350;
	}

	@ConfigItem(
			keyName = "sleepDeviation",
			name = "Sleep Deviation",
			description = "Enter sleep delay deviation here.",
			position = 43,
			titleSection = "delayTitle",
			hidden=true,
			unhide="customDelays"
	)
	default int sleepDeviation()
	{
		return 100;
	}

	@ConfigItem(
			keyName = "sleepTarget",
			name = "Sleep Target",
			description = "Enter target sleep delay here.",
			position = 44,
			titleSection = "delayTitle",
			hidden=true,
			unhide="customDelays"
	)
	default int sleepTarget()
	{
		return 100;
	}

	@ConfigItem(
			keyName = "sleepWeighted",
			name = "Sleep Weighted Distribution",
			description = "Click here to use a weighted distribution.",
			position = 45,
			titleSection = "delayTitle",
			hidden=true,
			unhide="customDelays"
	)
	default boolean sleepWeighted()
	{
		return false;
	}

	@ConfigItem(
			keyName = "tickMin",
			name = "Tick Min",
			description = "Enter minimum tick delay here.",
			position = 46,
			titleSection = "delayTitle",
			hidden=true,
			unhide="customDelays"
	)
	default int tickMin()
	{
		return 1;
	}

	@ConfigItem(
			keyName = "tickMax",
			name = "Tick Max",
			description = "Enter maximum tick delay here.",
			position = 47,
			titleSection = "delayTitle",
			hidden=true,
			unhide="customDelays"
	)
	default int tickMax()
	{
		return 3;
	}

	@ConfigItem(
			keyName = "tickDeviation",
			name = "Tick Deviation",
			description = "Enter tick delay deviation here.",
			position = 48,
			titleSection = "delayTitle",
			hidden=true,
			unhide="customDelays"
	)
	default int tickDeviation()
	{
		return 2;
	}

	@ConfigItem(
			keyName = "tickTarget",
			name = "Tick Target",
			description = "Enter target tick delay here.",
			position = 49,
			titleSection = "delayTitle",
			hidden=true,
			unhide="customDelays"
	)
	default int tickTarget()
	{
		return 2;
	}

	@ConfigItem(
			keyName = "tickWeighted",
			name = "Tick Weighted Distribution",
			description = "Click here to use a weighted distribution.",
			position = 50,
			titleSection = "delayTitle",
			hidden=true,
			unhide="customDelays"
	)
	default boolean tickWeighted()
	{
		return false;
	}

	@ConfigItem(
			keyName = "startButton",
			name = "Start/Stop",
			description = "Test button that changes variable value",
			position = 150
	)
	default Button startButton()
	{
		return new Button();
	}
}
