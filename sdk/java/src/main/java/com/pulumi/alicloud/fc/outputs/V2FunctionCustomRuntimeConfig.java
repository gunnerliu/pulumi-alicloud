// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class V2FunctionCustomRuntimeConfig {
    /**
     * @return Parameters received by the start entry command.
     * 
     */
    private @Nullable List<String> args;
    /**
     * @return List of Custom entry commands started by Custom Runtime. When there are multiple commands in the list, they are spliced in sequence.
     * 
     */
    private @Nullable List<String> commands;

    private V2FunctionCustomRuntimeConfig() {}
    /**
     * @return Parameters received by the start entry command.
     * 
     */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * @return List of Custom entry commands started by Custom Runtime. When there are multiple commands in the list, they are spliced in sequence.
     * 
     */
    public List<String> commands() {
        return this.commands == null ? List.of() : this.commands;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2FunctionCustomRuntimeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable List<String> commands;
        public Builder() {}
        public Builder(V2FunctionCustomRuntimeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
        }

        @CustomType.Setter
        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder commands(@Nullable List<String> commands) {
            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        public V2FunctionCustomRuntimeConfig build() {
            final var o = new V2FunctionCustomRuntimeConfig();
            o.args = args;
            o.commands = commands;
            return o;
        }
    }
}