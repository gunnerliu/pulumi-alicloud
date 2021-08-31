# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetApplicationsApplicationResult',
    'GetConfigMapsMapResult',
    'GetNamespacesNamespaceResult',
]

@pulumi.output_type
class GetApplicationsApplicationResult(dict):
    def __init__(__self__, *,
                 acr_assume_role_arn: str,
                 app_description: str,
                 app_name: str,
                 application_id: str,
                 command: str,
                 command_args: str,
                 config_map_mount_desc: str,
                 cpu: int,
                 create_time: str,
                 custom_host_alias: str,
                 edas_container_version: str,
                 envs: str,
                 id: str,
                 image_url: str,
                 jar_start_args: str,
                 jar_start_options: str,
                 jdk: str,
                 liveness: str,
                 memory: int,
                 min_ready_instances: int,
                 mount_desc: str,
                 mount_host: str,
                 namespace_id: str,
                 nas_id: str,
                 oss_ak_id: str,
                 oss_ak_secret: str,
                 oss_mount_descs: str,
                 package_type: str,
                 package_url: str,
                 package_version: str,
                 php_arms_config_location: str,
                 php_config: str,
                 php_config_location: str,
                 post_start: str,
                 pre_stop: str,
                 readiness: str,
                 region_id: str,
                 replicas: int,
                 repo_name: str,
                 repo_namespace: str,
                 repo_origin_type: str,
                 security_group_id: str,
                 sls_configs: str,
                 status: str,
                 termination_grace_period_seconds: int,
                 timezone: str,
                 tomcat_config: str,
                 vpc_id: str,
                 vswitch_id: str,
                 war_start_options: str,
                 web_container: str):
        """
        :param str acr_assume_role_arn: The ARN of the RAM role required when pulling images across accounts.
        :param str app_description: Application description information. No more than 1024 characters.
        :param str app_name: Application Name. Combinations of numbers, letters, and dashes (-) are allowed. It must start with a letter and the maximum length is 36 characters.
        :param str application_id: The first ID of the resource.
        :param str command: Mirror start command. The command must be an executable object in the container. For example: sleep. Setting this command will cause the original startup command of the mirror to become invalid.
        :param str command_args: Mirror startup command parameters. The parameters required for the above start command. For example: 1d.
        :param str config_map_mount_desc: ConfigMap mount description.
        :param int cpu: The CPU required for each instance, in millicores, cannot be 0.
        :param str create_time: Indicates That the Application of the Creation Time.
        :param str custom_host_alias: Custom host mapping in the container. For example: [{"hostName":"samplehost","ip":"127.0.0.1"}].
        :param str edas_container_version: The operating environment used by the Pandora application.
        :param str envs: The virtual switch where the elastic network card of the application instance is located. The switch must be located in the aforementioned VPC. The switch also has a binding relationship with the SAE namespace. If it is left blank, the default is the vSwitch ID bound to the namespace.
        :param str id: The ID of the Application.
        :param str image_url: Mirror address. Only Image type applications can configure the mirror address.
        :param str jar_start_args: The JAR package starts application parameters. Application default startup command: $JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS "$package_path" $JarStartArgs.
        :param str jar_start_options: The JAR package starts the application option. Application default startup command: $JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS "$package_path" $JarStartArgs.
        :param str jdk: The JDK version that the deployment package depends on. Image type applications are not supported.
        :param str liveness: Container health check. Containers that fail the health check will be shut down and restored. Currently, only the method of issuing commands in the container is supported.
        :param int memory: The memory required for each instance, in MB, cannot be 0. One-to-one correspondence with CPU.
        :param int min_ready_instances: The Minimum Available Instance. On the Change Had Promised during the Available Number of Instances to Be.
        :param str mount_desc: Mount description.
        :param str mount_host: Mount point of NAS in application VPC.
        :param str namespace_id: SAE namespace ID. Only namespaces whose names are lowercase letters and dashes (-) are supported, and must start with a letter. The namespace can be obtained by calling the DescribeNamespaceList interface.
        :param str nas_id: ID of the mounted NAS, Must be in the same region as the cluster. It must have an available mount point creation quota, or its mount point must be on a switch in the VPC. If it is not filled in and the mountDescs field is present, a NAS will be automatically purchased and mounted on the switch in the VPC by default.
        :param str oss_ak_id: OSS AccessKey ID.
        :param str oss_ak_secret: OSS  AccessKey Secret.
        :param str oss_mount_descs: OSS mount description information.
        :param str package_type: Application package type. Support FatJar, War and Image.
        :param str package_url: Deployment package address. Only FatJar or War type applications can configure the deployment package address.
        :param str package_version: The version number of the deployment package. Required when the Package Type is War and FatJar.
        :param str php_arms_config_location: The PHP application monitors the mount path, and you need to ensure that the PHP server will load the configuration file of this path. You don't need to pay attention to the configuration content, SAE will automatically render the correct configuration file.
        :param str php_config: PHP configuration file content.
        :param str php_config_location: PHP application startup configuration mount path, you need to ensure that the PHP server will start using this configuration file.
        :param str post_start: Execute the script after startup, the format is like: {"exec":{"command":["cat","/etc/group"]}}.
        :param str pre_stop: Execute the script before stopping, the format is like: {"exec":{"command":["cat","/etc/group"]}}.
        :param str readiness: Application startup status checks, containers that fail multiple health checks will be shut down and restarted. Containers that do not pass the health check will not receive SLB traffic. For example: {"exec":{"command":["sh","-c","cat /home/admin/start.sh"]},"initialDelaySeconds":30,"periodSeconds":30,"timeoutSeconds ":2}.
        :param int replicas: Initial number of instances.
        :param str security_group_id: Security group ID.
        :param str sls_configs: SLS  configuration.
        :param str status: The status of the resource.
        :param int termination_grace_period_seconds: Graceful offline timeout, the default is 30, the unit is seconds. The value range is 1~60.
        :param str timezone: Time zone, the default value is Asia/Shanghai.
        :param str tomcat_config: Tomcat file configuration, set to "" or "{}" means to delete the configuration:  useDefaultConfig: Whether to use a custom configuration, if it is true, it means that the custom configuration is not used; if it is false, it means that the custom configuration is used. If you do not use custom configuration, the following parameter configuration will not take effect.  contextInputType: Select the access path of the application.  war: No need to fill in the custom path, the access path of the application is the WAR package name. root: No need to fill in the custom path, the access path of the application is /. custom: You need to fill in the custom path in the custom path below. contextPath: custom path, this parameter only needs to be configured when the contextInputType type is custom.  httpPort: The port range is 1024~65535. Ports less than 1024 need Root permission to operate. Because the container is configured with Admin permissions, please fill in a port greater than 1024. If not configured, the default is 8080. maxThreads: Configure the number of connections in the connection pool, the default size is 400. uriEncoding: Tomcat encoding format, including UTF-8, ISO-8859-1, GBK and GB2312. If not set, the default is ISO-8859-1. useBodyEncoding: Whether to use BodyEncoding for URL.
        :param str vpc_id: The VPC corresponding to the SAE namespace. In SAE, a namespace can only correspond to one VPC and cannot be modified. Creating a SAE application in the namespace for the first time will form a binding relationship. Multiple namespaces can correspond to a VPC. If you leave it blank, it will default to the VPC ID bound to the namespace.
        :param str vswitch_id: The vswitch id.
        :param str war_start_options: WAR package launch application option. Application default startup command: java $JAVA_OPTS $CATALINA_OPTS [-Options] org.apache.catalina.startup.Bootstrap "$@" start.
        :param str web_container: The version of tomcat that the deployment package depends on. Image type applications are not supported.
        """
        pulumi.set(__self__, "acr_assume_role_arn", acr_assume_role_arn)
        pulumi.set(__self__, "app_description", app_description)
        pulumi.set(__self__, "app_name", app_name)
        pulumi.set(__self__, "application_id", application_id)
        pulumi.set(__self__, "command", command)
        pulumi.set(__self__, "command_args", command_args)
        pulumi.set(__self__, "config_map_mount_desc", config_map_mount_desc)
        pulumi.set(__self__, "cpu", cpu)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "custom_host_alias", custom_host_alias)
        pulumi.set(__self__, "edas_container_version", edas_container_version)
        pulumi.set(__self__, "envs", envs)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "image_url", image_url)
        pulumi.set(__self__, "jar_start_args", jar_start_args)
        pulumi.set(__self__, "jar_start_options", jar_start_options)
        pulumi.set(__self__, "jdk", jdk)
        pulumi.set(__self__, "liveness", liveness)
        pulumi.set(__self__, "memory", memory)
        pulumi.set(__self__, "min_ready_instances", min_ready_instances)
        pulumi.set(__self__, "mount_desc", mount_desc)
        pulumi.set(__self__, "mount_host", mount_host)
        pulumi.set(__self__, "namespace_id", namespace_id)
        pulumi.set(__self__, "nas_id", nas_id)
        pulumi.set(__self__, "oss_ak_id", oss_ak_id)
        pulumi.set(__self__, "oss_ak_secret", oss_ak_secret)
        pulumi.set(__self__, "oss_mount_descs", oss_mount_descs)
        pulumi.set(__self__, "package_type", package_type)
        pulumi.set(__self__, "package_url", package_url)
        pulumi.set(__self__, "package_version", package_version)
        pulumi.set(__self__, "php_arms_config_location", php_arms_config_location)
        pulumi.set(__self__, "php_config", php_config)
        pulumi.set(__self__, "php_config_location", php_config_location)
        pulumi.set(__self__, "post_start", post_start)
        pulumi.set(__self__, "pre_stop", pre_stop)
        pulumi.set(__self__, "readiness", readiness)
        pulumi.set(__self__, "region_id", region_id)
        pulumi.set(__self__, "replicas", replicas)
        pulumi.set(__self__, "repo_name", repo_name)
        pulumi.set(__self__, "repo_namespace", repo_namespace)
        pulumi.set(__self__, "repo_origin_type", repo_origin_type)
        pulumi.set(__self__, "security_group_id", security_group_id)
        pulumi.set(__self__, "sls_configs", sls_configs)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "termination_grace_period_seconds", termination_grace_period_seconds)
        pulumi.set(__self__, "timezone", timezone)
        pulumi.set(__self__, "tomcat_config", tomcat_config)
        pulumi.set(__self__, "vpc_id", vpc_id)
        pulumi.set(__self__, "vswitch_id", vswitch_id)
        pulumi.set(__self__, "war_start_options", war_start_options)
        pulumi.set(__self__, "web_container", web_container)

    @property
    @pulumi.getter(name="acrAssumeRoleArn")
    def acr_assume_role_arn(self) -> str:
        """
        The ARN of the RAM role required when pulling images across accounts.
        """
        return pulumi.get(self, "acr_assume_role_arn")

    @property
    @pulumi.getter(name="appDescription")
    def app_description(self) -> str:
        """
        Application description information. No more than 1024 characters.
        """
        return pulumi.get(self, "app_description")

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> str:
        """
        Application Name. Combinations of numbers, letters, and dashes (-) are allowed. It must start with a letter and the maximum length is 36 characters.
        """
        return pulumi.get(self, "app_name")

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> str:
        """
        The first ID of the resource.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter
    def command(self) -> str:
        """
        Mirror start command. The command must be an executable object in the container. For example: sleep. Setting this command will cause the original startup command of the mirror to become invalid.
        """
        return pulumi.get(self, "command")

    @property
    @pulumi.getter(name="commandArgs")
    def command_args(self) -> str:
        """
        Mirror startup command parameters. The parameters required for the above start command. For example: 1d.
        """
        return pulumi.get(self, "command_args")

    @property
    @pulumi.getter(name="configMapMountDesc")
    def config_map_mount_desc(self) -> str:
        """
        ConfigMap mount description.
        """
        return pulumi.get(self, "config_map_mount_desc")

    @property
    @pulumi.getter
    def cpu(self) -> int:
        """
        The CPU required for each instance, in millicores, cannot be 0.
        """
        return pulumi.get(self, "cpu")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        Indicates That the Application of the Creation Time.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="customHostAlias")
    def custom_host_alias(self) -> str:
        """
        Custom host mapping in the container. For example: [{"hostName":"samplehost","ip":"127.0.0.1"}].
        """
        return pulumi.get(self, "custom_host_alias")

    @property
    @pulumi.getter(name="edasContainerVersion")
    def edas_container_version(self) -> str:
        """
        The operating environment used by the Pandora application.
        """
        return pulumi.get(self, "edas_container_version")

    @property
    @pulumi.getter
    def envs(self) -> str:
        """
        The virtual switch where the elastic network card of the application instance is located. The switch must be located in the aforementioned VPC. The switch also has a binding relationship with the SAE namespace. If it is left blank, the default is the vSwitch ID bound to the namespace.
        """
        return pulumi.get(self, "envs")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Application.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="imageUrl")
    def image_url(self) -> str:
        """
        Mirror address. Only Image type applications can configure the mirror address.
        """
        return pulumi.get(self, "image_url")

    @property
    @pulumi.getter(name="jarStartArgs")
    def jar_start_args(self) -> str:
        """
        The JAR package starts application parameters. Application default startup command: $JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS "$package_path" $JarStartArgs.
        """
        return pulumi.get(self, "jar_start_args")

    @property
    @pulumi.getter(name="jarStartOptions")
    def jar_start_options(self) -> str:
        """
        The JAR package starts the application option. Application default startup command: $JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS "$package_path" $JarStartArgs.
        """
        return pulumi.get(self, "jar_start_options")

    @property
    @pulumi.getter
    def jdk(self) -> str:
        """
        The JDK version that the deployment package depends on. Image type applications are not supported.
        """
        return pulumi.get(self, "jdk")

    @property
    @pulumi.getter
    def liveness(self) -> str:
        """
        Container health check. Containers that fail the health check will be shut down and restored. Currently, only the method of issuing commands in the container is supported.
        """
        return pulumi.get(self, "liveness")

    @property
    @pulumi.getter
    def memory(self) -> int:
        """
        The memory required for each instance, in MB, cannot be 0. One-to-one correspondence with CPU.
        """
        return pulumi.get(self, "memory")

    @property
    @pulumi.getter(name="minReadyInstances")
    def min_ready_instances(self) -> int:
        """
        The Minimum Available Instance. On the Change Had Promised during the Available Number of Instances to Be.
        """
        return pulumi.get(self, "min_ready_instances")

    @property
    @pulumi.getter(name="mountDesc")
    def mount_desc(self) -> str:
        """
        Mount description.
        """
        return pulumi.get(self, "mount_desc")

    @property
    @pulumi.getter(name="mountHost")
    def mount_host(self) -> str:
        """
        Mount point of NAS in application VPC.
        """
        return pulumi.get(self, "mount_host")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> str:
        """
        SAE namespace ID. Only namespaces whose names are lowercase letters and dashes (-) are supported, and must start with a letter. The namespace can be obtained by calling the DescribeNamespaceList interface.
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter(name="nasId")
    def nas_id(self) -> str:
        """
        ID of the mounted NAS, Must be in the same region as the cluster. It must have an available mount point creation quota, or its mount point must be on a switch in the VPC. If it is not filled in and the mountDescs field is present, a NAS will be automatically purchased and mounted on the switch in the VPC by default.
        """
        return pulumi.get(self, "nas_id")

    @property
    @pulumi.getter(name="ossAkId")
    def oss_ak_id(self) -> str:
        """
        OSS AccessKey ID.
        """
        return pulumi.get(self, "oss_ak_id")

    @property
    @pulumi.getter(name="ossAkSecret")
    def oss_ak_secret(self) -> str:
        """
        OSS  AccessKey Secret.
        """
        return pulumi.get(self, "oss_ak_secret")

    @property
    @pulumi.getter(name="ossMountDescs")
    def oss_mount_descs(self) -> str:
        """
        OSS mount description information.
        """
        return pulumi.get(self, "oss_mount_descs")

    @property
    @pulumi.getter(name="packageType")
    def package_type(self) -> str:
        """
        Application package type. Support FatJar, War and Image.
        """
        return pulumi.get(self, "package_type")

    @property
    @pulumi.getter(name="packageUrl")
    def package_url(self) -> str:
        """
        Deployment package address. Only FatJar or War type applications can configure the deployment package address.
        """
        return pulumi.get(self, "package_url")

    @property
    @pulumi.getter(name="packageVersion")
    def package_version(self) -> str:
        """
        The version number of the deployment package. Required when the Package Type is War and FatJar.
        """
        return pulumi.get(self, "package_version")

    @property
    @pulumi.getter(name="phpArmsConfigLocation")
    def php_arms_config_location(self) -> str:
        """
        The PHP application monitors the mount path, and you need to ensure that the PHP server will load the configuration file of this path. You don't need to pay attention to the configuration content, SAE will automatically render the correct configuration file.
        """
        return pulumi.get(self, "php_arms_config_location")

    @property
    @pulumi.getter(name="phpConfig")
    def php_config(self) -> str:
        """
        PHP configuration file content.
        """
        return pulumi.get(self, "php_config")

    @property
    @pulumi.getter(name="phpConfigLocation")
    def php_config_location(self) -> str:
        """
        PHP application startup configuration mount path, you need to ensure that the PHP server will start using this configuration file.
        """
        return pulumi.get(self, "php_config_location")

    @property
    @pulumi.getter(name="postStart")
    def post_start(self) -> str:
        """
        Execute the script after startup, the format is like: {"exec":{"command":["cat","/etc/group"]}}.
        """
        return pulumi.get(self, "post_start")

    @property
    @pulumi.getter(name="preStop")
    def pre_stop(self) -> str:
        """
        Execute the script before stopping, the format is like: {"exec":{"command":["cat","/etc/group"]}}.
        """
        return pulumi.get(self, "pre_stop")

    @property
    @pulumi.getter
    def readiness(self) -> str:
        """
        Application startup status checks, containers that fail multiple health checks will be shut down and restarted. Containers that do not pass the health check will not receive SLB traffic. For example: {"exec":{"command":["sh","-c","cat /home/admin/start.sh"]},"initialDelaySeconds":30,"periodSeconds":30,"timeoutSeconds ":2}.
        """
        return pulumi.get(self, "readiness")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> str:
        return pulumi.get(self, "region_id")

    @property
    @pulumi.getter
    def replicas(self) -> int:
        """
        Initial number of instances.
        """
        return pulumi.get(self, "replicas")

    @property
    @pulumi.getter(name="repoName")
    def repo_name(self) -> str:
        return pulumi.get(self, "repo_name")

    @property
    @pulumi.getter(name="repoNamespace")
    def repo_namespace(self) -> str:
        return pulumi.get(self, "repo_namespace")

    @property
    @pulumi.getter(name="repoOriginType")
    def repo_origin_type(self) -> str:
        return pulumi.get(self, "repo_origin_type")

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> str:
        """
        Security group ID.
        """
        return pulumi.get(self, "security_group_id")

    @property
    @pulumi.getter(name="slsConfigs")
    def sls_configs(self) -> str:
        """
        SLS  configuration.
        """
        return pulumi.get(self, "sls_configs")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="terminationGracePeriodSeconds")
    def termination_grace_period_seconds(self) -> int:
        """
        Graceful offline timeout, the default is 30, the unit is seconds. The value range is 1~60.
        """
        return pulumi.get(self, "termination_grace_period_seconds")

    @property
    @pulumi.getter
    def timezone(self) -> str:
        """
        Time zone, the default value is Asia/Shanghai.
        """
        return pulumi.get(self, "timezone")

    @property
    @pulumi.getter(name="tomcatConfig")
    def tomcat_config(self) -> str:
        """
        Tomcat file configuration, set to "" or "{}" means to delete the configuration:  useDefaultConfig: Whether to use a custom configuration, if it is true, it means that the custom configuration is not used; if it is false, it means that the custom configuration is used. If you do not use custom configuration, the following parameter configuration will not take effect.  contextInputType: Select the access path of the application.  war: No need to fill in the custom path, the access path of the application is the WAR package name. root: No need to fill in the custom path, the access path of the application is /. custom: You need to fill in the custom path in the custom path below. contextPath: custom path, this parameter only needs to be configured when the contextInputType type is custom.  httpPort: The port range is 1024~65535. Ports less than 1024 need Root permission to operate. Because the container is configured with Admin permissions, please fill in a port greater than 1024. If not configured, the default is 8080. maxThreads: Configure the number of connections in the connection pool, the default size is 400. uriEncoding: Tomcat encoding format, including UTF-8, ISO-8859-1, GBK and GB2312. If not set, the default is ISO-8859-1. useBodyEncoding: Whether to use BodyEncoding for URL.
        """
        return pulumi.get(self, "tomcat_config")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        """
        The VPC corresponding to the SAE namespace. In SAE, a namespace can only correspond to one VPC and cannot be modified. Creating a SAE application in the namespace for the first time will form a binding relationship. Multiple namespaces can correspond to a VPC. If you leave it blank, it will default to the VPC ID bound to the namespace.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> str:
        """
        The vswitch id.
        """
        return pulumi.get(self, "vswitch_id")

    @property
    @pulumi.getter(name="warStartOptions")
    def war_start_options(self) -> str:
        """
        WAR package launch application option. Application default startup command: java $JAVA_OPTS $CATALINA_OPTS [-Options] org.apache.catalina.startup.Bootstrap "$@" start.
        """
        return pulumi.get(self, "war_start_options")

    @property
    @pulumi.getter(name="webContainer")
    def web_container(self) -> str:
        """
        The version of tomcat that the deployment package depends on. Image type applications are not supported.
        """
        return pulumi.get(self, "web_container")


@pulumi.output_type
class GetConfigMapsMapResult(dict):
    def __init__(__self__, *,
                 config_map_id: str,
                 create_time: str,
                 data: str,
                 description: str,
                 id: str,
                 name: str,
                 namespace_id: str):
        """
        :param str config_map_id: The first ID of the resource.
        :param str create_time: The Creation Time of the ConfigMap.
        :param str data: ConfigMap instance data. The value's format is a `json` string
        :param str description: The Description of Config Map.
        :param str id: The ID of the Config Map.
        :param str name: ConfigMap instance name.
        :param str namespace_id: The NamespaceId of Config Maps.
        """
        pulumi.set(__self__, "config_map_id", config_map_id)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "data", data)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "namespace_id", namespace_id)

    @property
    @pulumi.getter(name="configMapId")
    def config_map_id(self) -> str:
        """
        The first ID of the resource.
        """
        return pulumi.get(self, "config_map_id")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The Creation Time of the ConfigMap.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def data(self) -> str:
        """
        ConfigMap instance data. The value's format is a `json` string
        """
        return pulumi.get(self, "data")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The Description of Config Map.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Config Map.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        ConfigMap instance name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> str:
        """
        The NamespaceId of Config Maps.
        """
        return pulumi.get(self, "namespace_id")


@pulumi.output_type
class GetNamespacesNamespaceResult(dict):
    def __init__(__self__, *,
                 id: str,
                 namespace_description: str,
                 namespace_id: str,
                 namespace_name: str):
        """
        :param str id: The ID of the Namespace.
        :param str namespace_description: The Description of Namespace.
        :param str namespace_id: The Id of Namespace.It can contain 2 to 32 characters.The value is in format {RegionId}:{namespace}.
        :param str namespace_name: The Name of Namespace.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "namespace_description", namespace_description)
        pulumi.set(__self__, "namespace_id", namespace_id)
        pulumi.set(__self__, "namespace_name", namespace_name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Namespace.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="namespaceDescription")
    def namespace_description(self) -> str:
        """
        The Description of Namespace.
        """
        return pulumi.get(self, "namespace_description")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> str:
        """
        The Id of Namespace.It can contain 2 to 32 characters.The value is in format {RegionId}:{namespace}.
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> str:
        """
        The Name of Namespace.
        """
        return pulumi.get(self, "namespace_name")


