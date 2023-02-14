// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vod.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainsDomainSource {
    private String sourceContent;
    private String sourcePort;
    private String sourcePriority;
    private String sourceType;

    private GetDomainsDomainSource() {}
    public String sourceContent() {
        return this.sourceContent;
    }
    public String sourcePort() {
        return this.sourcePort;
    }
    public String sourcePriority() {
        return this.sourcePriority;
    }
    public String sourceType() {
        return this.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainsDomainSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String sourceContent;
        private String sourcePort;
        private String sourcePriority;
        private String sourceType;
        public Builder() {}
        public Builder(GetDomainsDomainSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceContent = defaults.sourceContent;
    	      this.sourcePort = defaults.sourcePort;
    	      this.sourcePriority = defaults.sourcePriority;
    	      this.sourceType = defaults.sourceType;
        }

        @CustomType.Setter
        public Builder sourceContent(String sourceContent) {
            this.sourceContent = Objects.requireNonNull(sourceContent);
            return this;
        }
        @CustomType.Setter
        public Builder sourcePort(String sourcePort) {
            this.sourcePort = Objects.requireNonNull(sourcePort);
            return this;
        }
        @CustomType.Setter
        public Builder sourcePriority(String sourcePriority) {
            this.sourcePriority = Objects.requireNonNull(sourcePriority);
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public GetDomainsDomainSource build() {
            final var o = new GetDomainsDomainSource();
            o.sourceContent = sourceContent;
            o.sourcePort = sourcePort;
            o.sourcePriority = sourcePriority;
            o.sourceType = sourceType;
            return o;
        }
    }
}