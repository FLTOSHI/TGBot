package fltoshi.TelegramBot.components;

import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;

import java.util.List;

public interface BotCommands {
    List<BotCommand> LIST_OF_COMMANDS = List.of(
            new BotCommand("start", "Запускает бота."),
            new BotCommand("/help", "Показывает информацию о боте."),
            new BotCommand("/all", "Показывает весь список книг.")
            );

    String HELP_TEXT = """
            Этот бот помогает считать количество сообщений в чате. Вам доступны следующие команды:

            /start - для запуска бота;
            /help - для вызова помощи;
            /all - для вызова всех книг.

            Удачи! \uD83C\uDF1A""";
}
