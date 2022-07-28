// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainPage404ConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainPage404ConfigArgs Empty = new DomainPage404ConfigArgs();

    @Import(name="customPageUrl")
    private @Nullable Output<String> customPageUrl;

    public Optional<Output<String>> customPageUrl() {
        return Optional.ofNullable(this.customPageUrl);
    }

    @Import(name="errorCode")
    private @Nullable Output<String> errorCode;

    public Optional<Output<String>> errorCode() {
        return Optional.ofNullable(this.errorCode);
    }

    @Import(name="pageType")
    private @Nullable Output<String> pageType;

    public Optional<Output<String>> pageType() {
        return Optional.ofNullable(this.pageType);
    }

    private DomainPage404ConfigArgs() {}

    private DomainPage404ConfigArgs(DomainPage404ConfigArgs $) {
        this.customPageUrl = $.customPageUrl;
        this.errorCode = $.errorCode;
        this.pageType = $.pageType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainPage404ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainPage404ConfigArgs $;

        public Builder() {
            $ = new DomainPage404ConfigArgs();
        }

        public Builder(DomainPage404ConfigArgs defaults) {
            $ = new DomainPage404ConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder customPageUrl(@Nullable Output<String> customPageUrl) {
            $.customPageUrl = customPageUrl;
            return this;
        }

        public Builder customPageUrl(String customPageUrl) {
            return customPageUrl(Output.of(customPageUrl));
        }

        public Builder errorCode(@Nullable Output<String> errorCode) {
            $.errorCode = errorCode;
            return this;
        }

        public Builder errorCode(String errorCode) {
            return errorCode(Output.of(errorCode));
        }

        public Builder pageType(@Nullable Output<String> pageType) {
            $.pageType = pageType;
            return this;
        }

        public Builder pageType(String pageType) {
            return pageType(Output.of(pageType));
        }

        public DomainPage404ConfigArgs build() {
            return $;
        }
    }

}
