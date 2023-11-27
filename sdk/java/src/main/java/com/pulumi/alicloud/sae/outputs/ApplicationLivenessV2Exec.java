// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationLivenessV2Exec {
    /**
     * @return Mirror start command. The command must be an executable object in the container. For example: sleep. Setting this command will cause the original startup command of the mirror to become invalid.
     * 
     */
    private @Nullable List<String> commands;

    private ApplicationLivenessV2Exec() {}
    /**
     * @return Mirror start command. The command must be an executable object in the container. For example: sleep. Setting this command will cause the original startup command of the mirror to become invalid.
     * 
     */
    public List<String> commands() {
        return this.commands == null ? List.of() : this.commands;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLivenessV2Exec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> commands;
        public Builder() {}
        public Builder(ApplicationLivenessV2Exec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
        }

        @CustomType.Setter
        public Builder commands(@Nullable List<String> commands) {
            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        public ApplicationLivenessV2Exec build() {
            final var _resultValue = new ApplicationLivenessV2Exec();
            _resultValue.commands = commands;
            return _resultValue;
        }
    }
}
