package emu.grasscutter.game.quest.content;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_QUEST_VAR_LESS;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueContent;

@QuestValueContent(QUEST_CONTENT_QUEST_VAR_LESS)
public class ContentQuestVarLess extends BaseContent {

    @Override
    public boolean execute(
            GameQuest quest, QuestData.QuestContentCondition condition, String paramStr, int... params) {
        int questVarValue = quest.getMainQuest().getQuestVars()[params[0]];
        Grasscutter.getLogger().debug("questVar {} : {}", params[0], questVarValue);
        return questVarValue < params[1];
    }
}
