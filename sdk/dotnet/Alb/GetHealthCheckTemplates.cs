// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb
{
    public static class GetHealthCheckTemplates
    {
        /// <summary>
        /// This data source provides the Alb Health Check Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///         var ids = Output.Create(AliCloud.Alb.GetHealthCheckTemplates.InvokeAsync(new AliCloud.Alb.GetHealthCheckTemplatesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.AlbHealthCheckTemplateId1 = ids.Apply(ids =&gt; ids.Templates?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.Alb.GetHealthCheckTemplates.InvokeAsync(new AliCloud.Alb.GetHealthCheckTemplatesArgs
        ///         {
        ///             NameRegex = "^my-HealthCheckTemplate",
        ///         }));
        ///         this.AlbHealthCheckTemplateId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Templates?[0]?.Id);
        ///     }
        /// 
        ///     [Output("albHealthCheckTemplateId1")]
        ///     public Output&lt;string&gt; AlbHealthCheckTemplateId1 { get; set; }
        ///     [Output("albHealthCheckTemplateId2")]
        ///     public Output&lt;string&gt; AlbHealthCheckTemplateId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetHealthCheckTemplatesResult> InvokeAsync(GetHealthCheckTemplatesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetHealthCheckTemplatesResult>("alicloud:alb/getHealthCheckTemplates:getHealthCheckTemplates", args ?? new GetHealthCheckTemplatesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Alb Health Check Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///         var ids = Output.Create(AliCloud.Alb.GetHealthCheckTemplates.InvokeAsync(new AliCloud.Alb.GetHealthCheckTemplatesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.AlbHealthCheckTemplateId1 = ids.Apply(ids =&gt; ids.Templates?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.Alb.GetHealthCheckTemplates.InvokeAsync(new AliCloud.Alb.GetHealthCheckTemplatesArgs
        ///         {
        ///             NameRegex = "^my-HealthCheckTemplate",
        ///         }));
        ///         this.AlbHealthCheckTemplateId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Templates?[0]?.Id);
        ///     }
        /// 
        ///     [Output("albHealthCheckTemplateId1")]
        ///     public Output&lt;string&gt; AlbHealthCheckTemplateId1 { get; set; }
        ///     [Output("albHealthCheckTemplateId2")]
        ///     public Output&lt;string&gt; AlbHealthCheckTemplateId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetHealthCheckTemplatesResult> Invoke(GetHealthCheckTemplatesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetHealthCheckTemplatesResult>("alicloud:alb/getHealthCheckTemplates:getHealthCheckTemplates", args ?? new GetHealthCheckTemplatesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHealthCheckTemplatesArgs : Pulumi.InvokeArgs
    {
        [Input("healthCheckTemplateIds")]
        private List<string>? _healthCheckTemplateIds;

        /// <summary>
        /// The health check template ids.
        /// </summary>
        public List<string> HealthCheckTemplateIds
        {
            get => _healthCheckTemplateIds ?? (_healthCheckTemplateIds = new List<string>());
            set => _healthCheckTemplateIds = value;
        }

        /// <summary>
        /// The name of the health check template.  The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
        /// </summary>
        [Input("healthCheckTemplateName")]
        public string? HealthCheckTemplateName { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Health Check Template IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Health Check Template name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetHealthCheckTemplatesArgs()
        {
        }
    }

    public sealed class GetHealthCheckTemplatesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("healthCheckTemplateIds")]
        private InputList<string>? _healthCheckTemplateIds;

        /// <summary>
        /// The health check template ids.
        /// </summary>
        public InputList<string> HealthCheckTemplateIds
        {
            get => _healthCheckTemplateIds ?? (_healthCheckTemplateIds = new InputList<string>());
            set => _healthCheckTemplateIds = value;
        }

        /// <summary>
        /// The name of the health check template.  The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
        /// </summary>
        [Input("healthCheckTemplateName")]
        public Input<string>? HealthCheckTemplateName { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Health Check Template IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Health Check Template name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetHealthCheckTemplatesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetHealthCheckTemplatesResult
    {
        public readonly ImmutableArray<string> HealthCheckTemplateIds;
        public readonly string? HealthCheckTemplateName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetHealthCheckTemplatesTemplateResult> Templates;

        [OutputConstructor]
        private GetHealthCheckTemplatesResult(
            ImmutableArray<string> healthCheckTemplateIds,

            string? healthCheckTemplateName,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetHealthCheckTemplatesTemplateResult> templates)
        {
            HealthCheckTemplateIds = healthCheckTemplateIds;
            HealthCheckTemplateName = healthCheckTemplateName;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Templates = templates;
        }
    }
}
