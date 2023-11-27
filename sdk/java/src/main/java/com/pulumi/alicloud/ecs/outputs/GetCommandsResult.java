// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetCommandsCommand;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCommandsResult {
    private @Nullable String commandProvider;
    private List<GetCommandsCommand> commands;
    private @Nullable String contentEncoding;
    private @Nullable String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String name;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String type;

    private GetCommandsResult() {}
    public Optional<String> commandProvider() {
        return Optional.ofNullable(this.commandProvider);
    }
    public List<GetCommandsCommand> commands() {
        return this.commands;
    }
    public Optional<String> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCommandsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String commandProvider;
        private List<GetCommandsCommand> commands;
        private @Nullable String contentEncoding;
        private @Nullable String description;
        private String id;
        private List<String> ids;
        private @Nullable String name;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetCommandsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandProvider = defaults.commandProvider;
    	      this.commands = defaults.commands;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.name = defaults.name;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder commandProvider(@Nullable String commandProvider) {
            this.commandProvider = commandProvider;
            return this;
        }
        @CustomType.Setter
        public Builder commands(List<GetCommandsCommand> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }
        public Builder commands(GetCommandsCommand... commands) {
            return commands(List.of(commands));
        }
        @CustomType.Setter
        public Builder contentEncoding(@Nullable String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GetCommandsResult build() {
            final var _resultValue = new GetCommandsResult();
            _resultValue.commandProvider = commandProvider;
            _resultValue.commands = commands;
            _resultValue.contentEncoding = contentEncoding;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.name = name;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
