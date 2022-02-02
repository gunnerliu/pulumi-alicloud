// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rdc
{
    public static class GetOrganizations
    {
        /// <summary>
        /// This data source provides the Rdc Organizations of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.137.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///         var config = new Config();
        ///         var name = config.Get("name") ?? "tf-testAccOrganizations-Organizations";
        ///         var @default = new AliCloud.Rdc.Organization("default", new AliCloud.Rdc.OrganizationArgs
        ///         {
        ///             OrganizationName = name,
        ///             Source = name,
        ///         });
        ///         var ids = AliCloud.Rdc.GetOrganizations.Invoke(new AliCloud.Rdc.GetOrganizationsInvokeArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 @default.Id,
        ///             },
        ///         });
        ///         this.RdcOrganizationId1 = ids.Apply(ids =&gt; ids.Id);
        ///         var nameRegex = Output.Create(AliCloud.Rdc.GetOrganizations.InvokeAsync(new AliCloud.Rdc.GetOrganizationsArgs
        ///         {
        ///             NameRegex = "^my-Organization",
        ///         }));
        ///         this.RdcOrganizationId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Id);
        ///     }
        /// 
        ///     [Output("rdcOrganizationId1")]
        ///     public Output&lt;string&gt; RdcOrganizationId1 { get; set; }
        ///     [Output("rdcOrganizationId2")]
        ///     public Output&lt;string&gt; RdcOrganizationId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetOrganizationsResult> InvokeAsync(GetOrganizationsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetOrganizationsResult>("alicloud:rdc/getOrganizations:getOrganizations", args ?? new GetOrganizationsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Rdc Organizations of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.137.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///         var config = new Config();
        ///         var name = config.Get("name") ?? "tf-testAccOrganizations-Organizations";
        ///         var @default = new AliCloud.Rdc.Organization("default", new AliCloud.Rdc.OrganizationArgs
        ///         {
        ///             OrganizationName = name,
        ///             Source = name,
        ///         });
        ///         var ids = AliCloud.Rdc.GetOrganizations.Invoke(new AliCloud.Rdc.GetOrganizationsInvokeArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 @default.Id,
        ///             },
        ///         });
        ///         this.RdcOrganizationId1 = ids.Apply(ids =&gt; ids.Id);
        ///         var nameRegex = Output.Create(AliCloud.Rdc.GetOrganizations.InvokeAsync(new AliCloud.Rdc.GetOrganizationsArgs
        ///         {
        ///             NameRegex = "^my-Organization",
        ///         }));
        ///         this.RdcOrganizationId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Id);
        ///     }
        /// 
        ///     [Output("rdcOrganizationId1")]
        ///     public Output&lt;string&gt; RdcOrganizationId1 { get; set; }
        ///     [Output("rdcOrganizationId2")]
        ///     public Output&lt;string&gt; RdcOrganizationId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetOrganizationsResult> Invoke(GetOrganizationsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetOrganizationsResult>("alicloud:rdc/getOrganizations:getOrganizations", args ?? new GetOrganizationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOrganizationsArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Organization IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Organization name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
        /// </summary>
        [Input("realPk")]
        public string? RealPk { get; set; }

        public GetOrganizationsArgs()
        {
        }
    }

    public sealed class GetOrganizationsInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Organization IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Organization name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// User pk, not required, only required when the ak used by the calling interface is inconsistent with the user pk
        /// </summary>
        [Input("realPk")]
        public Input<string>? RealPk { get; set; }

        public GetOrganizationsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetOrganizationsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly ImmutableArray<Outputs.GetOrganizationsOrganizationResult> Organizations;
        public readonly string? OutputFile;
        public readonly string? RealPk;

        [OutputConstructor]
        private GetOrganizationsResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            ImmutableArray<Outputs.GetOrganizationsOrganizationResult> organizations,

            string? outputFile,

            string? realPk)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            Organizations = organizations;
            OutputFile = outputFile;
            RealPk = realPk;
        }
    }
}
