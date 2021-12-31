// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sddp
{
    /// <summary>
    /// Provides a Data Security Center Config resource.
    /// 
    /// For information about Data Security Center Config and how to use it, see [What is Config](https://help.aliyun.com/product/88674.html).
    /// 
    /// &gt; **NOTE:** Available in v1.133.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var @default = new AliCloud.Sddp.Config("default", new AliCloud.Sddp.ConfigArgs
    ///         {
    ///             Code = "access_failed_cnt",
    ///             Value = "10",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Data Security Center Config can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:sddp/config:Config example &lt;code&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:sddp/config:Config")]
    public partial class Config : Pulumi.CustomResource
    {
        /// <summary>
        /// Abnormal Alarm General Configuration Module by Using the Encoding. Valid values: `access_failed_cnt`, `access_permission_exprie_max_days`, `log_datasize_avg_days`.
        /// </summary>
        [Output("code")]
        public Output<string?> Code { get; private set; } = null!;

        /// <summary>
        /// Abnormal Alarm General Description of the Configuration Item.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The language of the request and response. Valid values: `zh`,`en`.
        /// * `zh`: Chinese.
        /// * `en`: English.
        /// </summary>
        [Output("lang")]
        public Output<string?> Lang { get; private set; } = null!;

        /// <summary>
        /// The Specified Exception Alarm Generic by Using the Value. Code Different Values for This Parameter the Specific Meaning of Different:
        /// * `access_failed_cnt`: Value Represents the Non-Authorized Resource Repeatedly Attempts to Access the Threshold.
        /// * `access_permission_exprie_max_days`: Value Represents the Permissions during Periods of Inactivity Exceeding a Threshold.
        /// * `log_datasize_avg_days`: Value Represents the Date Certain Log Output Is Less than 10 Days before the Average Value of the Threshold.
        /// </summary>
        [Output("value")]
        public Output<string?> Value { get; private set; } = null!;


        /// <summary>
        /// Create a Config resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Config(string name, ConfigArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:sddp/config:Config", name, args ?? new ConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Config(string name, Input<string> id, ConfigState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:sddp/config:Config", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Config resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Config Get(string name, Input<string> id, ConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new Config(name, id, state, options);
        }
    }

    public sealed class ConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Abnormal Alarm General Configuration Module by Using the Encoding. Valid values: `access_failed_cnt`, `access_permission_exprie_max_days`, `log_datasize_avg_days`.
        /// </summary>
        [Input("code")]
        public Input<string>? Code { get; set; }

        /// <summary>
        /// Abnormal Alarm General Description of the Configuration Item.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The language of the request and response. Valid values: `zh`,`en`.
        /// * `zh`: Chinese.
        /// * `en`: English.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The Specified Exception Alarm Generic by Using the Value. Code Different Values for This Parameter the Specific Meaning of Different:
        /// * `access_failed_cnt`: Value Represents the Non-Authorized Resource Repeatedly Attempts to Access the Threshold.
        /// * `access_permission_exprie_max_days`: Value Represents the Permissions during Periods of Inactivity Exceeding a Threshold.
        /// * `log_datasize_avg_days`: Value Represents the Date Certain Log Output Is Less than 10 Days before the Average Value of the Threshold.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ConfigArgs()
        {
        }
    }

    public sealed class ConfigState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Abnormal Alarm General Configuration Module by Using the Encoding. Valid values: `access_failed_cnt`, `access_permission_exprie_max_days`, `log_datasize_avg_days`.
        /// </summary>
        [Input("code")]
        public Input<string>? Code { get; set; }

        /// <summary>
        /// Abnormal Alarm General Description of the Configuration Item.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The language of the request and response. Valid values: `zh`,`en`.
        /// * `zh`: Chinese.
        /// * `en`: English.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The Specified Exception Alarm Generic by Using the Value. Code Different Values for This Parameter the Specific Meaning of Different:
        /// * `access_failed_cnt`: Value Represents the Non-Authorized Resource Repeatedly Attempts to Access the Threshold.
        /// * `access_permission_exprie_max_days`: Value Represents the Permissions during Periods of Inactivity Exceeding a Threshold.
        /// * `log_datasize_avg_days`: Value Represents the Date Certain Log Output Is Less than 10 Days before the Average Value of the Threshold.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ConfigState()
        {
        }
    }
}
