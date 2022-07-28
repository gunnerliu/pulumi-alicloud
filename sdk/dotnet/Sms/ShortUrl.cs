// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sms
{
    /// <summary>
    /// Provides a SMS Short Url resource.
    /// 
    /// For information about SMS Short Url and how to use it, see [What is Short Url](https://help.aliyun.com/document_detail/419291.html).
    /// 
    /// &gt; **NOTE:** Available in v1.178.0+.
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
    ///         var example = new AliCloud.Sms.ShortUrl("example", new AliCloud.Sms.ShortUrlArgs
    ///         {
    ///             EffectiveDays = 30,
    ///             ShortUrlName = "example_value",
    ///             SourceUrl = "example_value",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// SMS Short Url can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:sms/shortUrl:ShortUrl example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:sms/shortUrl:ShortUrl")]
    public partial class ShortUrl : Pulumi.CustomResource
    {
        /// <summary>
        /// Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
        /// </summary>
        [Output("effectiveDays")]
        public Output<int> EffectiveDays { get; private set; } = null!;

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Output("shortUrlName")]
        public Output<string> ShortUrlName { get; private set; } = null!;

        /// <summary>
        /// The original link address.
        /// </summary>
        [Output("sourceUrl")]
        public Output<string> SourceUrl { get; private set; } = null!;

        /// <summary>
        /// Short chain status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a ShortUrl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ShortUrl(string name, ShortUrlArgs args, CustomResourceOptions? options = null)
            : base("alicloud:sms/shortUrl:ShortUrl", name, args ?? new ShortUrlArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ShortUrl(string name, Input<string> id, ShortUrlState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:sms/shortUrl:ShortUrl", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ShortUrl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ShortUrl Get(string name, Input<string> id, ShortUrlState? state = null, CustomResourceOptions? options = null)
        {
            return new ShortUrl(name, id, state, options);
        }
    }

    public sealed class ShortUrlArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
        /// </summary>
        [Input("effectiveDays", required: true)]
        public Input<int> EffectiveDays { get; set; } = null!;

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("shortUrlName", required: true)]
        public Input<string> ShortUrlName { get; set; } = null!;

        /// <summary>
        /// The original link address.
        /// </summary>
        [Input("sourceUrl", required: true)]
        public Input<string> SourceUrl { get; set; } = null!;

        public ShortUrlArgs()
        {
        }
    }

    public sealed class ShortUrlState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
        /// </summary>
        [Input("effectiveDays")]
        public Input<int>? EffectiveDays { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("shortUrlName")]
        public Input<string>? ShortUrlName { get; set; }

        /// <summary>
        /// The original link address.
        /// </summary>
        [Input("sourceUrl")]
        public Input<string>? SourceUrl { get; set; }

        /// <summary>
        /// Short chain status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ShortUrlState()
        {
        }
    }
}
