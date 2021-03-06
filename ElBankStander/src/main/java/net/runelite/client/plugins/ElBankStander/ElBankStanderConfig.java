/*
 * Copyright (c) 2018, Andrew EP | ElPinche256 <https://github.com/ElPinche256>
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
package net.runelite.client.plugins.ElBankStander;

import net.runelite.client.config.*;

@ConfigGroup("ElBankStander")

public interface ElBankStanderConfig extends Config
{
	@ConfigTitleSection(
			keyName = "instructionsTitle",
			name = "Instructions",
			description = "",
			position = 0
	)
	default Title instructionsTitle()
	{
		return new Title();
	}
	@ConfigItem(
			keyName = "instructions",
			name = "",
			description = "Instructions.",
			position = 1,
			titleSection = "instructionsTitle"
	)
	default String instructions()
	{
		return "Please select what activity you would like to do below. "+
				"Then enter the item IDs you would like to use for this activity.";
	}

	@ConfigTitleSection(
			keyName = "generalTitle",
			name = "General Config",
			description = "",
			position = 10
	)
	default Title generalTitle()
	{
		return new Title();
	}

	@ConfigItem(
			keyName = "type",
			name = "Type",
			description = "Select what activity you would like to do.",
			position = 11,
			titleSection = "generalTitle"
	)
	default ElBankStanderType type()
	{
		return ElBankStanderType.USE_ITEM;
	}

	@ConfigItem(
			keyName = "firstId",
			name = "First Item ID",
			description = "Enter the Id of the first item you will use.",
			position = 12,
			titleSection = "generalTitle"
	)
	default int firstId() { return 0; }

	@ConfigItem(
			keyName = "secondId",
			name = "Second Item ID",
			description = "Enter the Id of the second item you will use.",
			position = 13,
			hidden = true,
			unhide = "type",
			unhideValue = "USE_ITEM_ON_ITEM",
			titleSection = "generalTitle"
	)
	default int secondId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "toolId",
			name = "Tool ID",
			description = "Enter the Id of the tool you will be using.",
			position = 14,
			hidden = true,
			unhide = "type",
			unhideValue = "USE_TOOL_ON_ITEM",
			titleSection = "generalTitle"
	)
	default int toolId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "placeholder1Id",
			name = "Placeholder ID",
			description = "Enter the Id of anything additional you will be using.",
			position = 15,
			titleSection = "generalTitle"
	)
	default int placeholder1Id()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "placeholder2Id",
			name = "Placeholder ID",
			description = "Enter the Id of anything additional you will be using.",
			position = 15,
			titleSection = "generalTitle"
	)
	default int placeholder2Id()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "placeholder3Id",
			name = "Placeholder ID",
			description = "Enter the Id of anything additional you will be using.",
			position = 15,
			titleSection = "generalTitle"
	)
	default int placeholder3Id()
	{
		return 0;
	}

	@ConfigTitleSection(
			keyName = "bankTitle",
			name = "Bank Config",
			description = "",
			position = 18
	)
	default Title bankTitle()
	{
		return new Title();
	}

	@ConfigItem(
			keyName = "grandExchange",
			name = "Grand Exchange",
			description = "Tick this for grand exchange banking.",
			position = 19,
			titleSection = "bankTitle"
	)
	default boolean grandExchange()
	{
		return false;
	}

	@ConfigTitleSection(
			keyName = "menuTitle",
			name = "Menu Config",
			description = "",
			position = 20
	)
	default Title menuTitle()
	{
		return new Title();
	}

	@ConfigItem(
			keyName = "menuOp",
			name = "Menu OpCode",
			description = "Enter the menu opcode here.",
			position = 21,
			titleSection = "menuTitle"
	)
	default int menuOp()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "menuParam1",
			name = "Menu Param1",
			description = "Enter the menu param1 here.",
			position = 22,
			titleSection = "menuTitle"
	)
	default int menuParam1()
	{
		return 0;
	}

	@ConfigTitleSection(
			keyName = "inventoryTitle",
			name = "Inventory Config",
			description = "",
			position = 30
	)
	default Title inventoryTitle()
	{
		return new Title();
	}

	@ConfigItem(
			keyName = "inventoryOp",
			name = "Inventory OpCode",
			description = "Enter the inventory opcode here.",
			position = 31,
			titleSection = "inventoryTitle"
	)
	default int inventoryOp()
	{
		return 0;
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
			keyName = "sleepMin",
			name = "Sleep Min",
			description = "Enter minimum sleep delay here.",
			position = 41,
			titleSection = "delayTitle"
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
			titleSection = "delayTitle"
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
			titleSection = "delayTitle"
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
			titleSection = "delayTitle"
	)
	default int sleepTarget()
	{
		return 100;
	}

	@ConfigItem(
			keyName = "tickMin",
			name = "Tick Min",
			description = "Enter minimum tick delay here.",
			position = 45,
			titleSection = "delayTitle"
	)
	default int tickMin()
	{
		return 1;
	}

	@ConfigItem(
			keyName = "tickMax",
			name = "Tick Max",
			description = "Enter maximum tick delay here.",
			position = 46,
			titleSection = "delayTitle"
	)
	default int tickMax()
	{
		return 3;
	}

	@ConfigItem(
			keyName = "tickDeviation",
			name = "Tick Deviation",
			description = "Enter tick delay deviation here.",
			position = 47,
			titleSection = "delayTitle"
	)
	default int tickDeviation()
	{
		return 2;
	}

	@ConfigItem(
			keyName = "tickTarget",
			name = "Tick Target",
			description = "Enter target tick delay here.",
			position = 48,
			titleSection = "delayTitle"
	)
	default int tickTarget()
	{
		return 2;
	}

	@ConfigItem(
			keyName = "startButton",
			name = "Start/Stop",
			description = "Test button that changes variable value",
			position = 100
	)
	default Button startButton()
	{
		return new Button();
	}
}