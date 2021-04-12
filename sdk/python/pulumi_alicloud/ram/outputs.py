# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = [
    'PolicyStatement',
    'GetGroupsGroupResult',
    'GetPoliciesPolicyResult',
    'GetRolesRoleResult',
    'GetSamlProvidersProviderResult',
    'GetUsersUserResult',
]

@pulumi.output_type
class PolicyStatement(dict):
    def __init__(__self__, *,
                 actions: Sequence[str],
                 effect: str,
                 resources: Sequence[str]):
        """
        :param Sequence[str] actions: (It has been deprecated from version 1.49.0, and use field 'document' to replace.) List of operations for the `resource`. The format of each item in this list is `${service}:${action_name}`, such as `oss:ListBuckets` and `ecs:Describe*`. The `${service}` can be `ecs`, `oss`, `ots` and so on, the `${action_name}` refers to the name of an api interface which related to the `${service}`.
        :param str effect: (It has been deprecated from version 1.49.0, and use field 'document' to replace.) This parameter indicates whether or not the `action` is allowed. Valid values are `Allow` and `Deny`.
        :param Sequence[str] resources: (It has been deprecated from version 1.49.0, and use field 'document' to replace.) List of specific objects which will be authorized. The format of each item in this list is `acs:${service}:${region}:${account_id}:${relative_id}`, such as `acs:ecs:*:*:instance/inst-002` and `acs:oss:*:1234567890000:mybucket`. The `${service}` can be `ecs`, `oss`, `ots` and so on, the `${region}` is the region info which can use `*` replace when it is not supplied, the `${account_id}` refers to someone's Alicloud account id or you can use `*` to replace, the `${relative_id}` is the resource description section which related to the `${service}`.
        """
        pulumi.set(__self__, "actions", actions)
        pulumi.set(__self__, "effect", effect)
        pulumi.set(__self__, "resources", resources)

    @property
    @pulumi.getter
    def actions(self) -> Sequence[str]:
        """
        (It has been deprecated from version 1.49.0, and use field 'document' to replace.) List of operations for the `resource`. The format of each item in this list is `${service}:${action_name}`, such as `oss:ListBuckets` and `ecs:Describe*`. The `${service}` can be `ecs`, `oss`, `ots` and so on, the `${action_name}` refers to the name of an api interface which related to the `${service}`.
        """
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter
    def effect(self) -> str:
        """
        (It has been deprecated from version 1.49.0, and use field 'document' to replace.) This parameter indicates whether or not the `action` is allowed. Valid values are `Allow` and `Deny`.
        """
        return pulumi.get(self, "effect")

    @property
    @pulumi.getter
    def resources(self) -> Sequence[str]:
        """
        (It has been deprecated from version 1.49.0, and use field 'document' to replace.) List of specific objects which will be authorized. The format of each item in this list is `acs:${service}:${region}:${account_id}:${relative_id}`, such as `acs:ecs:*:*:instance/inst-002` and `acs:oss:*:1234567890000:mybucket`. The `${service}` can be `ecs`, `oss`, `ots` and so on, the `${region}` is the region info which can use `*` replace when it is not supplied, the `${account_id}` refers to someone's Alicloud account id or you can use `*` to replace, the `${relative_id}` is the resource description section which related to the `${service}`.
        """
        return pulumi.get(self, "resources")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class GetGroupsGroupResult(dict):
    def __init__(__self__, *,
                 comments: str,
                 name: str):
        """
        :param str comments: Comments of the group.
        :param str name: Name of the group.
        """
        pulumi.set(__self__, "comments", comments)
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def comments(self) -> str:
        """
        Comments of the group.
        """
        return pulumi.get(self, "comments")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the group.
        """
        return pulumi.get(self, "name")


@pulumi.output_type
class GetPoliciesPolicyResult(dict):
    def __init__(__self__, *,
                 attachment_count: int,
                 create_date: str,
                 default_version: str,
                 description: str,
                 document: str,
                 id: str,
                 name: str,
                 policy_document: str,
                 policy_name: str,
                 type: str,
                 update_date: str,
                 user_name: str,
                 version_id: str):
        """
        :param int attachment_count: Attachment count of the policy.
        :param str create_date: Creation date of the policy.
        :param str default_version: Default version of the policy.
        :param str description: Description of the policy.
        :param str document: Policy document of the policy.
        :param str name: Name of the policy.
        :param str policy_document: Policy document of the policy.
        :param str policy_name: Name of the policy.
        :param str type: Filter results by a specific policy type. Valid values are `Custom` and `System`.
        :param str update_date: Update date of the policy.
        :param str user_name: Filter results by a specific user name. Returned policies are attached to the specified user.
        :param str version_id: The ID of default policy.
        """
        pulumi.set(__self__, "attachment_count", attachment_count)
        pulumi.set(__self__, "create_date", create_date)
        pulumi.set(__self__, "default_version", default_version)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "document", document)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "policy_document", policy_document)
        pulumi.set(__self__, "policy_name", policy_name)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "update_date", update_date)
        pulumi.set(__self__, "user_name", user_name)
        pulumi.set(__self__, "version_id", version_id)

    @property
    @pulumi.getter(name="attachmentCount")
    def attachment_count(self) -> int:
        """
        Attachment count of the policy.
        """
        return pulumi.get(self, "attachment_count")

    @property
    @pulumi.getter(name="createDate")
    def create_date(self) -> str:
        """
        Creation date of the policy.
        """
        return pulumi.get(self, "create_date")

    @property
    @pulumi.getter(name="defaultVersion")
    def default_version(self) -> str:
        """
        Default version of the policy.
        """
        return pulumi.get(self, "default_version")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the policy.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def document(self) -> str:
        """
        Policy document of the policy.
        """
        return pulumi.get(self, "document")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="policyDocument")
    def policy_document(self) -> str:
        """
        Policy document of the policy.
        """
        return pulumi.get(self, "policy_document")

    @property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> str:
        """
        Name of the policy.
        """
        return pulumi.get(self, "policy_name")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Filter results by a specific policy type. Valid values are `Custom` and `System`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="updateDate")
    def update_date(self) -> str:
        """
        Update date of the policy.
        """
        return pulumi.get(self, "update_date")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> str:
        """
        Filter results by a specific user name. Returned policies are attached to the specified user.
        """
        return pulumi.get(self, "user_name")

    @property
    @pulumi.getter(name="versionId")
    def version_id(self) -> str:
        """
        The ID of default policy.
        """
        return pulumi.get(self, "version_id")


@pulumi.output_type
class GetRolesRoleResult(dict):
    def __init__(__self__, *,
                 arn: str,
                 assume_role_policy_document: str,
                 create_date: str,
                 description: str,
                 document: str,
                 id: str,
                 name: str,
                 update_date: str):
        """
        :param str arn: Resource descriptor of the role.
        :param str assume_role_policy_document: Authorization strategy of the role. This parameter is deprecated and replaced by `document`.
        :param str create_date: Creation date of the role.
        :param str description: Description of the role.
        :param str document: Authorization strategy of the role.
        :param str id: Id of the role.
        :param str name: Name of the role.
        :param str update_date: Update date of the role.
        """
        pulumi.set(__self__, "arn", arn)
        pulumi.set(__self__, "assume_role_policy_document", assume_role_policy_document)
        pulumi.set(__self__, "create_date", create_date)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "document", document)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "update_date", update_date)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        Resource descriptor of the role.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="assumeRolePolicyDocument")
    def assume_role_policy_document(self) -> str:
        """
        Authorization strategy of the role. This parameter is deprecated and replaced by `document`.
        """
        return pulumi.get(self, "assume_role_policy_document")

    @property
    @pulumi.getter(name="createDate")
    def create_date(self) -> str:
        """
        Creation date of the role.
        """
        return pulumi.get(self, "create_date")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the role.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def document(self) -> str:
        """
        Authorization strategy of the role.
        """
        return pulumi.get(self, "document")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Id of the role.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the role.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="updateDate")
    def update_date(self) -> str:
        """
        Update date of the role.
        """
        return pulumi.get(self, "update_date")


@pulumi.output_type
class GetSamlProvidersProviderResult(dict):
    def __init__(__self__, *,
                 arn: str,
                 description: str,
                 encodedsaml_metadata_document: str,
                 id: str,
                 saml_provider_name: str,
                 update_date: str):
        """
        :param str arn: The Alibaba Cloud Resource Name (ARN) of the IdP.
        :param str description: The description of SAML Provider.
        :param str encodedsaml_metadata_document: The encodedsaml metadata document.
        :param str id: The ID of the SAML Provider.
        :param str saml_provider_name: The saml provider name.
        :param str update_date: The update time.
        """
        pulumi.set(__self__, "arn", arn)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "encodedsaml_metadata_document", encodedsaml_metadata_document)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "saml_provider_name", saml_provider_name)
        pulumi.set(__self__, "update_date", update_date)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        The Alibaba Cloud Resource Name (ARN) of the IdP.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of SAML Provider.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="encodedsamlMetadataDocument")
    def encodedsaml_metadata_document(self) -> str:
        """
        The encodedsaml metadata document.
        """
        return pulumi.get(self, "encodedsaml_metadata_document")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the SAML Provider.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="samlProviderName")
    def saml_provider_name(self) -> str:
        """
        The saml provider name.
        """
        return pulumi.get(self, "saml_provider_name")

    @property
    @pulumi.getter(name="updateDate")
    def update_date(self) -> str:
        """
        The update time.
        """
        return pulumi.get(self, "update_date")


@pulumi.output_type
class GetUsersUserResult(dict):
    def __init__(__self__, *,
                 create_date: str,
                 id: str,
                 last_login_date: str,
                 name: str):
        """
        :param str create_date: Creation date of the user.
        :param str id: The original id is user name, but it is user id in 1.37.0+.
        :param str last_login_date: Last login date of the user. Removed from version 1.79.0.
        :param str name: Name of the user.
        """
        pulumi.set(__self__, "create_date", create_date)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "last_login_date", last_login_date)
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="createDate")
    def create_date(self) -> str:
        """
        Creation date of the user.
        """
        return pulumi.get(self, "create_date")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The original id is user name, but it is user id in 1.37.0+.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastLoginDate")
    def last_login_date(self) -> str:
        """
        Last login date of the user. Removed from version 1.79.0.
        """
        return pulumi.get(self, "last_login_date")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the user.
        """
        return pulumi.get(self, "name")


