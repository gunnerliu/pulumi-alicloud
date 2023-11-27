// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.alicloud.fc.outputs.GetTriggersTrigger;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTriggersResult {
    private String functionName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of FC triggers ids.
     * 
     */
    private List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of FC triggers names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    private String serviceName;
    /**
     * @return A list of FC triggers. Each element contains the following attributes:
     * 
     */
    private List<GetTriggersTrigger> triggers;

    private GetTriggersResult() {}
    public String functionName() {
        return this.functionName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of FC triggers ids.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of FC triggers names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return A list of FC triggers. Each element contains the following attributes:
     * 
     */
    public List<GetTriggersTrigger> triggers() {
        return this.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String functionName;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private String serviceName;
        private List<GetTriggersTrigger> triggers;
        public Builder() {}
        public Builder(GetTriggersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.serviceName = defaults.serviceName;
    	      this.triggers = defaults.triggers;
        }

        @CustomType.Setter
        public Builder functionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
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
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        @CustomType.Setter
        public Builder triggers(List<GetTriggersTrigger> triggers) {
            this.triggers = Objects.requireNonNull(triggers);
            return this;
        }
        public Builder triggers(GetTriggersTrigger... triggers) {
            return triggers(List.of(triggers));
        }
        public GetTriggersResult build() {
            final var _resultValue = new GetTriggersResult();
            _resultValue.functionName = functionName;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.serviceName = serviceName;
            _resultValue.triggers = triggers;
            return _resultValue;
        }
    }
}
