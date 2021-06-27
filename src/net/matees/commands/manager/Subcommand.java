package net.matees.commands.manager;

import java.util.List;

public abstract class Subcommand {
    public abstract String getName();

    public abstract String getDescription();

    public abstract List<String> getArgs();

    public abstract String getSyntax();

    public abstract void execCommand(String[] flags);

    public abstract List<String> getSubCommandArgs(String[] flags);
}
