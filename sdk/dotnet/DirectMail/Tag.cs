// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DirectMail
{
    /// <summary>
    /// Provides a Direct Mail Tag resource.
    /// 
    /// For information about Direct Mail Tag and how to use it, see [What is Tag](https://www.alibabacloud.com/help/zh/doc-detail/119007.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.144.0+.
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
    ///         var example = new AliCloud.DirectMail.Tag("example", new AliCloud.DirectMail.TagArgs
    ///         {
    ///             TagName = "example_value",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Direct Mail Tag can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:directmail/tag:Tag example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:directmail/tag:Tag")]
    public partial class Tag : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the tag. The name must be `1` to `50` characters in length, and can contain letters and digits.
        /// </summary>
        [Output("tagName")]
        public Output<string> TagName { get; private set; } = null!;


        /// <summary>
        /// Create a Tag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Tag(string name, TagArgs args, CustomResourceOptions? options = null)
            : base("alicloud:directmail/tag:Tag", name, args ?? new TagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Tag(string name, Input<string> id, TagState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:directmail/tag:Tag", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Tag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Tag Get(string name, Input<string> id, TagState? state = null, CustomResourceOptions? options = null)
        {
            return new Tag(name, id, state, options);
        }
    }

    public sealed class TagArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the tag. The name must be `1` to `50` characters in length, and can contain letters and digits.
        /// </summary>
        [Input("tagName", required: true)]
        public Input<string> TagName { get; set; } = null!;

        public TagArgs()
        {
        }
    }

    public sealed class TagState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the tag. The name must be `1` to `50` characters in length, and can contain letters and digits.
        /// </summary>
        [Input("tagName")]
        public Input<string>? TagName { get; set; }

        public TagState()
        {
        }
    }
}
