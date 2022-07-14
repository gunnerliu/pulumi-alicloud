// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eds
{
    /// <summary>
    /// Provides a ECD Custom Property resource.
    /// 
    /// For information about ECD Custom Property and how to use it, see [What is Custom Property](https://help.aliyun.com/document_detail/436381.html).
    /// 
    /// &gt; **NOTE:** Available in v1.176.0+.
    /// 
    /// &gt; **NOTE:** Up to 10 different attributes can be created under an alibaba cloud account. Up to 50 different attribute values can be added under an attribute.
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
    ///         var example = new AliCloud.Eds.CustomProperty("example", new AliCloud.Eds.CustomPropertyArgs
    ///         {
    ///             PropertyKey = "example_key",
    ///             PropertyValues = 
    ///             {
    ///                 new AliCloud.Eds.Inputs.CustomPropertyPropertyValueArgs
    ///                 {
    ///                     PropertyValue = "example_value",
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// ECD Custom Property can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:eds/customProperty:CustomProperty example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:eds/customProperty:CustomProperty")]
    public partial class CustomProperty : Pulumi.CustomResource
    {
        /// <summary>
        /// The Custom attribute key.
        /// </summary>
        [Output("propertyKey")]
        public Output<string> PropertyKey { get; private set; } = null!;

        /// <summary>
        /// Custom attribute sets the value of. See the following `Block property_values`.
        /// </summary>
        [Output("propertyValues")]
        public Output<ImmutableArray<Outputs.CustomPropertyPropertyValue>> PropertyValues { get; private set; } = null!;


        /// <summary>
        /// Create a CustomProperty resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomProperty(string name, CustomPropertyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:eds/customProperty:CustomProperty", name, args ?? new CustomPropertyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomProperty(string name, Input<string> id, CustomPropertyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:eds/customProperty:CustomProperty", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomProperty resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomProperty Get(string name, Input<string> id, CustomPropertyState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomProperty(name, id, state, options);
        }
    }

    public sealed class CustomPropertyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Custom attribute key.
        /// </summary>
        [Input("propertyKey", required: true)]
        public Input<string> PropertyKey { get; set; } = null!;

        [Input("propertyValues")]
        private InputList<Inputs.CustomPropertyPropertyValueArgs>? _propertyValues;

        /// <summary>
        /// Custom attribute sets the value of. See the following `Block property_values`.
        /// </summary>
        public InputList<Inputs.CustomPropertyPropertyValueArgs> PropertyValues
        {
            get => _propertyValues ?? (_propertyValues = new InputList<Inputs.CustomPropertyPropertyValueArgs>());
            set => _propertyValues = value;
        }

        public CustomPropertyArgs()
        {
        }
    }

    public sealed class CustomPropertyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Custom attribute key.
        /// </summary>
        [Input("propertyKey")]
        public Input<string>? PropertyKey { get; set; }

        [Input("propertyValues")]
        private InputList<Inputs.CustomPropertyPropertyValueGetArgs>? _propertyValues;

        /// <summary>
        /// Custom attribute sets the value of. See the following `Block property_values`.
        /// </summary>
        public InputList<Inputs.CustomPropertyPropertyValueGetArgs> PropertyValues
        {
            get => _propertyValues ?? (_propertyValues = new InputList<Inputs.CustomPropertyPropertyValueGetArgs>());
            set => _propertyValues = value;
        }

        public CustomPropertyState()
        {
        }
    }
}
