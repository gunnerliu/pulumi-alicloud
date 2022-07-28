// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApiSystemParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiSystemParameterArgs Empty = new ApiSystemParameterArgs();

    /**
     * System parameter location; values: &#39;HEAD&#39; and &#39;QUERY&#39;.
     * 
     */
    @Import(name="in", required=true)
    private Output<String> in;

    /**
     * @return System parameter location; values: &#39;HEAD&#39; and &#39;QUERY&#39;.
     * 
     */
    public Output<String> in() {
        return this.in;
    }

    /**
     * System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html).
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html).
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Backend service&#39;s parameter name.
     * 
     */
    @Import(name="nameService", required=true)
    private Output<String> nameService;

    /**
     * @return Backend service&#39;s parameter name.
     * 
     */
    public Output<String> nameService() {
        return this.nameService;
    }

    private ApiSystemParameterArgs() {}

    private ApiSystemParameterArgs(ApiSystemParameterArgs $) {
        this.in = $.in;
        this.name = $.name;
        this.nameService = $.nameService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiSystemParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiSystemParameterArgs $;

        public Builder() {
            $ = new ApiSystemParameterArgs();
        }

        public Builder(ApiSystemParameterArgs defaults) {
            $ = new ApiSystemParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param in System parameter location; values: &#39;HEAD&#39; and &#39;QUERY&#39;.
         * 
         * @return builder
         * 
         */
        public Builder in(Output<String> in) {
            $.in = in;
            return this;
        }

        /**
         * @param in System parameter location; values: &#39;HEAD&#39; and &#39;QUERY&#39;.
         * 
         * @return builder
         * 
         */
        public Builder in(String in) {
            return in(Output.of(in));
        }

        /**
         * @param name System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html).
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name System parameter name which supports values including in [system parameter list](https://www.alibabacloud.com/help/doc-detail/43677.html).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nameService Backend service&#39;s parameter name.
         * 
         * @return builder
         * 
         */
        public Builder nameService(Output<String> nameService) {
            $.nameService = nameService;
            return this;
        }

        /**
         * @param nameService Backend service&#39;s parameter name.
         * 
         * @return builder
         * 
         */
        public Builder nameService(String nameService) {
            return nameService(Output.of(nameService));
        }

        public ApiSystemParameterArgs build() {
            $.in = Objects.requireNonNull($.in, "expected parameter 'in' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.nameService = Objects.requireNonNull($.nameService, "expected parameter 'nameService' to be non-null");
            return $;
        }
    }

}
