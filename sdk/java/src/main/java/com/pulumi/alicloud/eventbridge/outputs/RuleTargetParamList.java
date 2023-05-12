// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleTargetParamList {
    /**
     * @return The format of param.  Valid values: `ORIGINAL`, `TEMPLATE`, `JSONPATH`, `CONSTANT`.
     * 
     */
    private final String form;
    /**
     * @return The resource key of param.  For more information, see [Event target parameters](https://help.aliyun.com/document_detail/185887.htm)
     * 
     */
    private final String resourceKey;
    /**
     * @return The template of param.
     * 
     * &gt; **NOTE:** There exists a potential diff error that the backend service will return a default param as following:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * In order to fix the diff, from version 1.160.0,
     * this resource has removed the param which `resource_key = &#34;IsBase64Encode&#34;` and `value = &#34;false&#34;`.
     * If you want to set `resource_key = &#34;IsBase64Encode&#34;`, please avoid to set `value = &#34;false&#34;`.
     * 
     */
    private final @Nullable String template;
    /**
     * @return The value of param.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private RuleTargetParamList(
        @CustomType.Parameter("form") String form,
        @CustomType.Parameter("resourceKey") String resourceKey,
        @CustomType.Parameter("template") @Nullable String template,
        @CustomType.Parameter("value") @Nullable String value) {
        this.form = form;
        this.resourceKey = resourceKey;
        this.template = template;
        this.value = value;
    }

    /**
     * @return The format of param.  Valid values: `ORIGINAL`, `TEMPLATE`, `JSONPATH`, `CONSTANT`.
     * 
     */
    public String form() {
        return this.form;
    }
    /**
     * @return The resource key of param.  For more information, see [Event target parameters](https://help.aliyun.com/document_detail/185887.htm)
     * 
     */
    public String resourceKey() {
        return this.resourceKey;
    }
    /**
     * @return The template of param.
     * 
     * &gt; **NOTE:** There exists a potential diff error that the backend service will return a default param as following:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * In order to fix the diff, from version 1.160.0,
     * this resource has removed the param which `resource_key = &#34;IsBase64Encode&#34;` and `value = &#34;false&#34;`.
     * If you want to set `resource_key = &#34;IsBase64Encode&#34;`, please avoid to set `value = &#34;false&#34;`.
     * 
     */
    public Optional<String> template() {
        return Optional.ofNullable(this.template);
    }
    /**
     * @return The value of param.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleTargetParamList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String form;
        private String resourceKey;
        private @Nullable String template;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleTargetParamList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.form = defaults.form;
    	      this.resourceKey = defaults.resourceKey;
    	      this.template = defaults.template;
    	      this.value = defaults.value;
        }

        public Builder form(String form) {
            this.form = Objects.requireNonNull(form);
            return this;
        }
        public Builder resourceKey(String resourceKey) {
            this.resourceKey = Objects.requireNonNull(resourceKey);
            return this;
        }
        public Builder template(@Nullable String template) {
            this.template = template;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public RuleTargetParamList build() {
            return new RuleTargetParamList(form, resourceKey, template, value);
        }
    }
}
